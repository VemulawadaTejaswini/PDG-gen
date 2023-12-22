import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static boolean[] isPrime;
	static final int MAX_INDEX = 123456*2;
	public static void main(String[] args) {
		makePrime();
		while(read()){
			solve();
		}
	}
	static void makePrime(){
		isPrime = new boolean[MAX_INDEX + 1];
		//System.out.println(MAX_INDEX);
		//System.out.println(isPrime.length);
		isPrime[1] = false;
		for(int i = 2; i < isPrime.length; i++)isPrime[i] = true;
		for(int i = 2; i <= MAX_INDEX; i++){
			if(isPrime[i] == true){
				for(int j = 2; j*i <= MAX_INDEX; j++){
					isPrime[i*j] = false;
				}
			}
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		return true;
	}
	static void solve(){
		int count = 0;
		for(int i = n+1; i <= 2*n; i++){
			if(isPrime[i] == true)count++;
		}
		/*if(n == 13){
			for(int i = 13; i < 26; i++){
				if(isPrime[i] == true)System.out.println(i);
			}
		}*/
		System.out.println(count);
	}
}