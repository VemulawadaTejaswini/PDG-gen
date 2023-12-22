import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static boolean[] prime;
	static int n;
	public static void main(String[] args) {
		eratosthenes();
		while(read()){
			solve();
		}
	}
	
	static void eratosthenes(){
		prime = new boolean[100001];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		
		for(int i = 2; i < prime.length; i++){
			if(prime[i]){
				for(int j = 2*i; j < prime.length; j += i){
					prime[j] = false;
				}
			}
		}
	}
	
	static boolean read(){
		if(!sc.hasNext())return false;
		
		n = sc.nextInt();
		return true;
	}
	
	static void solve(){
		int res = 0;
		for(int i = 2; i <= n; i++){
			if(prime[i])res++;
		}
		System.out.println(res);
	}

}