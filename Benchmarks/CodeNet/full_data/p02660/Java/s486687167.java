

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		if(n == 1){
			System.out.println(0);
			return;
		}

		//nが素数かどうか判定
		boolean isPrime = true;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				isPrime = false;
				break;
			}
		}

		if(isPrime){
			System.out.println(1);
			return;
		}

		PrimeNumberGenerator pg = new PrimeNumberGenerator();

		long result = 0;
		for(int i = 2; i <= n ; i++){
			if(!pg.isPrime(i)){
				continue;
			}

			long j = 1;
			while(n % Math.pow(i, j) == 0){
				n /= Math.pow(i, j);
				j++;
				result++;
			}
		}

		System.out.println(result);
	}
}

class PrimeNumberGenerator {
    private boolean[] isPrime= new boolean[100001];

    public PrimeNumberGenerator() {
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;

        int limit = (int)Math.sqrt(isPrime.length);
        for(int i = 3; i <= limit; i+=2){
            if(isPrime[i] == false){
                continue;
            }

            for(int j = i * 2; j <= isPrime.length - 1; j += i){
                isPrime[j] = false;
            }
        }
    }

    public boolean isPrime(int index){
        if(index % 2 == 0 && index != 2){
            return false;
        }
        return isPrime[index];
    }
}