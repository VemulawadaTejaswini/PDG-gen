import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}

		int count = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=arr.length-1; j>i; j--) {
				if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
      		        arr[j] = arr[j-1];
      		        arr[j-1] = temp;
					count++;
				}
			}
		}

		for (int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(arr[arr.length-1]);
		System.out.println(count);
	}

}

