import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static boolean[] prime = new boolean[50001];
	static int n;
	public static void main(String[] args) {
		make_prime();
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		return true;
	}
	
	static void solve(){
		int res = 0;
		for(int i = 0; i < prime.length/2; i++){
			if(prime[i]){
				for(int j = i; i + j < prime.length; j++){
					if(prime[j] == true && i + j == n)res++;
				}
			}
		}
		System.out.println(res);
	}
	
	static void make_prime(){
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

}