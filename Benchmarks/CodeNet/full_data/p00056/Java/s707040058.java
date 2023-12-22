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

		primeSet(60000);

		while(true){
			int n = stdIn.nextInt();

			if(n==0){
				return;
			}
			else if(n%2==1){
				System.out.println("0");
			}
			else{
				int cnt = 0;
				for(int i=2;i<n;i++){
					for(int j=i;j<n;j++){
						if(primes[i]&&primes[j]&&n==i+j){
							cnt++;
						}
					}
				}
				System.out.println(cnt);
			}
		}
	}
}