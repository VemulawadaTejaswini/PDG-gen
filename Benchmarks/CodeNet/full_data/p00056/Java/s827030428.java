import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static final int MAX = 50000;
	public static void main(String[] args) {
		final int[] primeTable = getPrimeNumbers(MAX);
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int target = sc.nextInt();
			if(target == 0)	break;
			System.out.println(getNumCombination(target, primeTable));
		}
	}
	
	public static int getNumCombination(int targetNumber, int[] primeTable){
		if(targetNumber % 2 == 1)	return 0;
		
		int c = 0;
		int length = primeTable.length;
		for(int i = length - 1; i >= 0; i--){
			if(targetNumber < primeTable[i]) continue;
			for(int j = 0; j < length && j <= i; j++){
				if(targetNumber == primeTable[i] + primeTable[j])	c++;
			}
		}
		return c;
	}
    private static int[] getPrimeNumbers(int n){
    	ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i < n + 1; i++){
            if(isPrimeNumber(i)){
            	list.add(i);
            }
        }
        int[] primeNumbers = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
        	primeNumbers[i] = list.get(i);
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