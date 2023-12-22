import java.util.*;

class Main {
	
	static boolean primeTable[] = new boolean[10001];
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		makePrimeCheckTable(10000);
		while(in.hasNext()){
			int n = in.nextInt();
			int cnt=0;
			for(int i=1; i<=n; i++){
				if(isPrime(i) && isPrime(n-i+1))
					cnt++;
			}
			System.out.println(cnt);
		}
	}
	
	private static void makePrimeCheckTable(int n){
		for(int i=2; i<=n; i++) primeTable[i] = true;
		for(int i=2; i*i<=n; i++){
			if(primeTable[i]){
				for(int j=i*2; j<=n; j += i){
					primeTable[j] = false;
				}
			}
		}
	}
	
	private static boolean isPrime(int n){
		return primeTable[n];
	}
}