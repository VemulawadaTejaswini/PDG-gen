import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aSize1 = input.nextInt();
		int[] arr1 = new int[aSize1];
		
		for (int i = 0; i < aSize1; i++) {
			arr1[i] = input.nextInt();
		}
		
		int aSize2 = input.nextInt();
		int[] arr2 = new int[aSize2];
		
		for (int i = 0; i < aSize2; i++) {
			arr2[i] = input.nextInt();
		}
		
		System.out.println(countIntersection(arr1, arr2));
	}
	
	public static int countIntersection(int[] arr1, int[] arr2) {
		int result = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					result++;
					break;
				}
			}
		}
		
		return result;
	}
}

