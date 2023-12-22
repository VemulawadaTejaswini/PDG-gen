import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] A = inpNum(n);

		bubbleSort(A);

	}

	private static void bubbleSort(int[] A) {
		boolean flag = true;
		int cnt = 0;

		while(flag) {
			flag = false;

			for (int j = A.length - 1; j > 0; j-- ) {
				if (A[j] < A[j -1]) {
					int tmp;
					tmp = A[j];
					A[j] = A[j - 1];
					A[j -1] = tmp;
					cnt++;
					flag = true;
				}

			}

		}

		for (int k = 0; k < A.length; k++ ) {
			System.out.print(A[k]);
			if(k < A.length -1) {
				System.out.print(" ");
			}

		}
		System.out.println();
		System.out.println(cnt);

	}

	private static int[] inpNum(int n) {
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		return nums;
	}

}
