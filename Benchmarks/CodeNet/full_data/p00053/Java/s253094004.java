import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
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
		ArrayList<Long> primeNumber = getPrimeNumbers();
		for(int i = 0; i < numOfPrimeNumbers; i++){
			sum += (long)primeNumber.get(i);
		}
		return sum;
	}
	private static ArrayList<Long> getPrimeNumbers(){
		ArrayList<Long> primeNumber = new ArrayList<Long>();
		int numPrimeNumbers = 0;
		long n = 1;
		while(numPrimeNumbers < 10000){
			if( isPrimeNumber(++n) ){
				primeNumber.add(Long.valueOf(n));
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