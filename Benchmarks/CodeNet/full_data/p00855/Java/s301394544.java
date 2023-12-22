import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static boolean[] prime = new boolean[1300000];
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
		if(prime[n]){
			System.out.println(0);
		}else{
			int up = 0, down = 0;
			for(int i = n; !prime[i]; i++){
				up++;
			}
			for(int i = n; !prime[i]; i--){
				down++;
			}
			System.out.println(up + down);
		}
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