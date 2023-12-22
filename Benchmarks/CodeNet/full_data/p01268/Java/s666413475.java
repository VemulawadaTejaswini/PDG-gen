import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, p;
	static boolean[] prime;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		makePrime();
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		p = sc.nextInt();
		if( n == -1 && p == -1 )return false;
		return true;
	}
	
	static void solve(){
		int pn = n+1;
		int count = 0;
		while(true){
			if(count >= 100)break;
			if(prime[pn])count++;
			pn++;
		}
		for(int i = n+1; i < pn; i++){
			if(prime[i]){
				for(int j = i; j < pn; j++){
					if(prime[j])list.add(i+j);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.get(p-1));
		list.clear();
	}
	
	static void makePrime(){
		prime = new boolean[200001];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for(int i = 2; i < prime.length; i++){
			if(prime[i]){
				for(int j = i*2; j < prime.length; j += i){
					prime[j] = false;
				}
			}
		}
	}

}