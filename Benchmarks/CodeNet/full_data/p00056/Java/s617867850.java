import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	private static final int MAX = 50000;
	public static void main(String[] args) throws IOException{
		final int[] combinationTable = getCombinationTable();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int target = Integer.parseInt(br.readLine());
			if(target == 0)	break;
			System.out.println(combinationTable[target]);
		}
	}
	
	public static int[] getCombinationTable(){
		final int[] primeTable = getPrimeNumbers(MAX);
		int[] t = new int[MAX + 1];
		for(int i = 4; i < MAX + 1; i++){
			t[i] = getNumCombination(i, primeTable);
		}
		return t;
	}
	public static int getNumCombination(final int targetNumber, int[] primeTable){
		int c = 0;
		for(int sourceIndex = 0; sourceIndex < primeTable.length; sourceIndex++){
			/*重複する組み合わせの探索に入る前に終了する*/
			if(targetNumber / 2 < primeTable[sourceIndex]) break;
			/*ベース値が目標値を既に超えている場合、以降成立する組み合わせは存在しない*/
//			if(targetNumber < primeTable[sourceIndex]) break;
			/*ベース値と足して目標値になる値が存在すればカウントする*/
			int n = targetNumber - primeTable[sourceIndex];
			if(Arrays.binarySearch(primeTable, n) >= 0){
				c++;
			}
		}
		return c;
	}
    private static int[] getPrimeNumbers(int n){
    	ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i < n + 1; i++){
            if(isPrimeNumber(i))	list.add(i);
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