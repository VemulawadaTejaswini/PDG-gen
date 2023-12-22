import java.util.Arrays;
import java.util.Scanner;


public class Main{
	
	static Scanner sc = new Scanner(System.in);
	
	static int n, sum;
	static boolean prime[];

	public static void main(String[] args) {
		
		while(read()){
			solve();
		}

	}
	
	public static boolean read(){
		if(!sc.hasNext()) return false;
		
		n = sc.nextInt();
		
		return true;
	}
	
	public static void solve(){
		
		prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		
		for(int i = 2; i < prime.length; i++){
			if(prime[i]){
				for(int j = 2 * i; j < prime.length; j += i){
					prime[j] = false;
				}
			}
		}
		
		sum = 0;
		for(int i = 0; i < prime.length; i++){
			if(prime[i]) sum++;
		}
		
		System.out.println(sum);
	}

}