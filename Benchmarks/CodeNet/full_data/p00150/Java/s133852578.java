import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int MAX_NUM_OF_PRIME_NUMBERS = 10000;
	static long[] primeTable = new long[MAX_NUM_OF_PRIME_NUMBERS];
	
	public static void main(String[] args) throws IOException{
		primeTable = getPrimeNumbers();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n == 0)	break;
			int[] prime = getMaxTwinPrime(n);
			System.out.println(prime[0] + " " + prime[1]);
		}
	}
	public static int[] getMaxTwinPrime(int max){
		int[] prime = new int[2];
		int maxIndex = 0;
		for(int i = 0; i < primeTable.length; i++){
			if(primeTable[i] > max){
				maxIndex = i - 1;
				break;
			}
		}
		for(int i = maxIndex; i > 0; i--){
			if(primeTable[i] - primeTable[i - 1] == 2){
				prime[0] = (int)primeTable[i - 1];
				prime[1] = (int)primeTable[i];
				break;
			}
		}
		return prime;
	}
	private static long[] getPrimeNumbers(){
		long[] primeNumber = new long[MAX_NUM_OF_PRIME_NUMBERS];
		int numPrimeNumbers = 0;
		long n = 1;
		while(numPrimeNumbers < MAX_NUM_OF_PRIME_NUMBERS){
			if( isPrimeNumber(++n) ){
				primeNumber[numPrimeNumbers] = n;
				numPrimeNumbers++;
			}
		}
		return primeNumber;
	}
	private static boolean isPrimeNumber(long target){
		if( target == 2 )	return true;
		if( target % 2 == 0 )	return false;
		for(int i = 3; i * i < target + 1; i = i + 2){
			if( target % i == 0){
				return false;
			}
		}
		return true;
	}
}