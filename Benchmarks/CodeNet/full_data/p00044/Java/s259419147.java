import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[] prime;
	public static void main(String[] args) {
		makePrime();
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext())return false;
		n = sc.nextInt();
		return true;
	}
	static void solve(){
		int resMin = Integer.MAX_VALUE;
		int resMax = Integer.MIN_VALUE;
		for(int i = 2; i < prime.length; i++){
			if(prime[i] == 1 && n < i){
				resMax = i;
				break;
			}
		}
		for(int i = prime.length-1; i > 2 ; i--){
			if(prime[i] == 1 && n > i){
				resMin = i;
				break;
			}
		}
		System.out.println(resMin + " " + resMax);
	}
	static void makePrime(){
		prime = new int[50101];
		for(int i = 1; i < prime.length; i++){
			prime[i] = 1;
		}
			for(int j = 2; j < prime.length; j++){
				if(prime[j] == 1){
					for(int k = 2; j*k <= prime.length-1; k++ ){
						prime[j*k] = 0;
					}
				}
			}
	}
}