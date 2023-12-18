import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();

			int[] dArray = new int[n];
			
			HashMap<Integer, Integer> distinctNums = new HashMap<>();
			
			for(int i = 0 ; i < n ; i++ ) {
				dArray[i] = sc.nextInt();
				if ( i == 0 && dArray[i] != 0 ) {
					System.out.println(0);
					return ;
				}
				if ( distinctNums.containsKey(dArray[i])) {
					int currentNum = distinctNums.get(dArray[i]);
					currentNum++;
					distinctNums.put(dArray[i], currentNum);
				}
				else {
					distinctNums.put(dArray[i], 1);
				}
			}
			
			Integer[] keyArray = distinctNums.keySet().toArray(new Integer[]{});
			Arrays.sort(keyArray);
			
			if ( keyArray.length == 1 ) {
				System.out.println(0);
				return;
			}
			double currentResult = 1;
			int layerNum = 0;
			int previousNums = distinctNums.get(keyArray[0]);
			
			for(int i = 1 ; i < keyArray.length ; i++ ) {
				//System.out.println(keyArray[i]);
				int currentLayerNum = keyArray[i];
				
				if ( layerNum + 1 != currentLayerNum) {
					System.out.println(0);
					return;
				}
				
				int currentNodeNums = distinctNums.get(currentLayerNum);
				//System.out.println(keyArray[i] + ": " + currentNodeNum);
				
				currentResult = currentResult * (Math.pow(previousNums, currentNodeNums) % 998244353);
				previousNums = currentNodeNums;
				
				layerNum++;
				
			}
			

			long result = (long)(currentResult % 998244353);
			System.out.println(result);
			
			
		}
	}
}