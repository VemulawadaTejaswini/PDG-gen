import java.util.Scanner;

public class Main {

	
	public static boolean exist(int[] list, int number, int start, int end) {
	
		int l = end - start;
		int midIndex = start + l/2;
		
		if(start == end) {
			return list[start] == number;
		}
		else if(list[midIndex] == number) {
			return true;
		}
		else if(list[midIndex] > number) {
			return exist(list,number,start,midIndex);
		}
		else {
			return exist(list, number, midIndex+1, end);
		}
		
				
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arraySizeS = sc.nextLine();
		int arraySize = Integer.parseInt(arraySizeS);
		String[] inputArrayS = sc.nextLine().split(" ");
		int[] inputArray = new int[arraySize];
		for( int i = 0; i < arraySize; i += 1) {
			inputArray[i] = Integer.parseInt(inputArrayS[i]);}
		String arraySizeS2 = sc.nextLine();
		int arraySize2 = Integer.parseInt(arraySizeS2);
		String[] inputArrayS2 = sc.nextLine().split(" ");
		int[] inputArray2 = new int[arraySize2];
		for( int j = 0; j < arraySize2; j += 1) {
			inputArray2[j] = Integer.parseInt(inputArrayS2[j]);	
		}
		
		int counter = 0;
		
		for(int m = 0; m < inputArray2.length; m += 1) {
			if (exist(inputArray,inputArray2[m],0,inputArray.length-1)) {
				counter += 1;
			}
		}
		System.out.println(counter);
			
	}

}
