import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int[] intList = new int[length];
		int k = 0;
		for(int i = 0; i < intList.length; i++) {
			intList[i] = input.nextInt();
		}
		for(int m = 0; m < intList.length - 1; m++) {
			System.out.print(intList[m] + " ");
		}
		System.out.println(intList[intList.length - 1]);
		for(int i = 1; i < intList.length; i++) {
			int key = intList[i];
			int j = i - 1;
			while(j >= 0 && intList[j] > key) {
				intList[j+1] = intList[j];
				j--;
			}
			intList[j+1] = key;
			for(int m = 0; m < intList.length - 1; m++) {
				System.out.print(intList[m] + " ");
			}
			System.out.println(intList[intList.length - 1]);
		}
	}
}
