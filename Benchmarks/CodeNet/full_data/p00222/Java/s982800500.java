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

		int call = 0;
		while(true){
			int n = stdIn.nextInt();
			if(n==0)
				return;
			if(call<n){
				primeSet(n);
				call=n;
			}

			for(int i=n;;i--){
				if(primes[i]&&primes[i-2]&&primes[i-6]&&primes[i-8]){
					System.out.println(i);
					break;
				}
			}
		}
	}
}