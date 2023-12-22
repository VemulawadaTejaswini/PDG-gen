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
		
		System.out.println(countBinarySearch(arr1, arr2));
	}
	
	public static int countBinarySearch(int[] arr1, int[] arr2) {
		int result = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (searchBinary(arr1, arr2[i], 0, arr1.length - 1)) {
				result++;
			}
		}
		return result;
	}
	
	public static boolean searchBinary(int[] arr, int key, int start, int end) {
		/*
		if (start > end) {
			return false;
		} else {
			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] > key) {
				return searchBinary(arr, key, start, mid - 1);
			} else {
				return searchBinary(arr, key, mid + 1, end);
			}
		}
		*/
		
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] > key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		return false;
	}
}

