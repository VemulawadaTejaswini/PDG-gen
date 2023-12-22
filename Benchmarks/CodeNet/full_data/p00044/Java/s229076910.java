import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	private static final int NOT_FOUND = -1000;
	private static final int MIN = 2;
	private static final int MAX_NUM = 50500;
	public static void main(String[] args) throws IOException{
		//素数の算出
		int[] primeNumbers = getPrimeNumbers(MAX_NUM);
		boolean[] isPrime = new boolean[MAX_NUM + 1];
		for(int i : primeNumbers){
			isPrime[i] = true;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while((input = br.readLine()) != null){
			int target = Integer.parseInt(input);
			System.out.println(
					getApproximateLowerPrime(isPrime, target)
					+ " " +
					getApproximateHigherPrime(isPrime, target)
					);
		}
		
	}
	private static int getApproximateLowerPrime(boolean[] isPrime, int n){
		for(int i = n - 1; i >= 0; i--){
			if(isPrime[i]) return i;
		}
		return NOT_FOUND;
	}
	private static int getApproximateHigherPrime(boolean[] isPrime, int n){
		for(int i = n + 1; i < isPrime.length; i++){
			if(isPrime[i]) return i;
		}
		return NOT_FOUND;
	}
    private static int[] getPrimeNumbers(int n){
    	ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = MIN; i < n + 1; i++){
            if(isPrimeNumber(i)){
            	list.add(i);
            }
        }
        Object[] arry = list.toArray();
        int[] primeNumbers = new int[arry.length];
        for(int i = 0; i < primeNumbers.length; i++){
        	primeNumbers[i] = (Integer)arry[i];
        }
        return primeNumbers;
    }
    private static boolean isPrimeNumber(int n){
    	if(n == 2){
    		return true;
    	}
    	else if(n % 2 == 0){
    		return false;
    	}
    	
    	for(int i = 3; i  * i < n + 1; i = i + 2){
    		if(n % i == 0){
    			return false;
    		}
    	}
    	return true;
    }
}