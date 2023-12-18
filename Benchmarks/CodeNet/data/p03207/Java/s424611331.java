import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] intArray;
		intArray = new int[x - 1];
		int temp = 0;
		int total = 0;
		for(int i = 0; i < x; i++){
			intArray[i] = sc.nextInt();
		}
		for (int i = 0; i < x; i++) {
			for (int j = 1; j < x; j++) {
				if(intArray[i] < intArray[j]) {
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		for(int i = 0; i < x; i++){
			if(i == 0){
				total = total + intArray[i] / 2; 
			} else{
				total = total + intArray[i];
			}
		}
	}
}