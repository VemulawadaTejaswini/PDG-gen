
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static final int MAX_NUM_OF_PRIME_NUMBERS = 10000;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int numOfPrimeNumbers = Integer.parseInt(br.readLine());
			if( numOfPrimeNumbers == 0 )	break;
			System.out.println(getSumOfPrimeNumbers(numOfPrimeNumbers));
		}
	}
	public static long getSumOfPrimeNumbers(int numOfPrimeNumbers){
		long sum = 0;
		long[] primeNumber = getPrimeNumbers();
		for(int i = 0; i < numOfPrimeNumbers; i++){
			sum += primeNumber[i];
		}
		return sum;
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