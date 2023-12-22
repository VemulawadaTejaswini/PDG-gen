import java.util.Scanner;

public class Main {
	public static boolean inList(int number, int[] list) {
		for(int n = 0; n < list.length; n += 1) {
			if (list[n] == number) {
				return true;
			}
		}
		return false;	
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
			if(inList(inputArray2[m],inputArray)) {
				counter += 1;
			}
		}
		System.out.println(counter);
			
	}

}

