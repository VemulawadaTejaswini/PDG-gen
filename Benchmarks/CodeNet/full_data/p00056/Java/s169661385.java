import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static final int MAX = 50000;
	private static final Integer[] PRIMES = getPrimeNumbers(MAX);
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int target = Integer.parseInt(br.readLine());
			if(target == 0)	break;
			System.out.println(getNumCombination(target, PRIMES));
		}
	}
	
	public static int getNumCombination(final int targetNumber, final Integer[] primeTable){
		int c = 0;
		int pl = 0;
		int pr = primeTable.length - 1;		//targetNumberに近似する値を持つindexを代入すればより高速
		while(pl <= pr){
			if(primeTable[pl] + primeTable[pr] > targetNumber){
				pr--;
			}else if(primeTable[pl] + primeTable[pr] == targetNumber){
				c++;
				pl++;
			}else{
				pl++;
			}
		}
		return c;
	}
	
    private static Integer[] getPrimeNumbers(final int n){
    	ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i < n + 1; i++){
            if(isPrimeNumber(i))	list.add(i);
        }
        return list.toArray(new Integer[list.size()]);
    }
    
    private static boolean isPrimeNumber(final int n){
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