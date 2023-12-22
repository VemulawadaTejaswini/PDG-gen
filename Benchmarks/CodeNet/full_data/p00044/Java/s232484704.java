import java.util.Scanner;

public class Main {

	static boolean[] primes;

	static void primeSet(final int MAX){
		primes = new boolean[MAX+1];

		primes[2] = true;
		for(int i=3;i<=MAX;i+=2){
			primes[i] = true;
		}
		int rt = (int) Math.sqrt(MAX);
		for(int i=3;i<=rt;i+=2){
			if(primes[i]){
				for(int j=i*2;j<=MAX;j+=i){
					primes[j] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		primeSet(50021);

		while(stdIn.hasNext()){
			int n = stdIn.nextInt();
			
			for(int i=n-1;;i--){
				if(primes[i]){
					System.out.print(i+" ");
					break;
				}
			}
			for(int i=n+1;;i++){
				if(primes[i]){
					System.out.println(i);
					break;
				}
			}
		}	
	}
}