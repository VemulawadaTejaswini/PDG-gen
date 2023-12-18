import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] intArray1 = new int[m];
		int[] intArray2 = new int[m];
		int[] intArray4 = new int[m];
		
	
		for(int i=0; i < m; i++) {
		    int s = sc.nextInt();
		    intArray1[i] = s;
		    int k = sc.nextInt();
		    intArray2[i] = k;
		    
		}
		for(int j=0; j < m; j++) {
			int[] intArray3 = new int[m];
			int count2 = 0;
			if(!Arrays.asList(intArray4).contains(intArray1[j])){
			
			int count = 0;
			for(int k=1; k < m; k++) {
				if(intArray1[j] == intArray1[k] && k != j && j < k) {
					
					intArray3 [count] = intArray2[k];
					count = count + 1;
					}
			}
			Arrays.sort(intArray3);
			
			for(int l=0; l < m; l++) {
				for(int o=0; o < intArray3.length; o++) {
				if(intArray3[o] == intArray2[l]) {
					intArray2[l] = o + 1;
				}
				}
			}
			intArray4[count2] = intArray1[j];
			}
		}
		for(int p=0; p < m; p++) {
			int intA = String.valueOf( intArray1[p] ).length(); 
			int intB = String.valueOf( intArray2[p] ).length(); 
			String result1 = "";
			String result2 = "";
			while(6 > intA) {
				result1 = result1 + "0";
			}
			while(6 > intB) {
				result2 = result2 + "0";
			}
			result1 = result1 + String.valueOf(intArray1[p]);
			result2 = result2 + String.valueOf(intArray2[p]);
			System.out.println(result1 + result2);
		}
	}
		
}