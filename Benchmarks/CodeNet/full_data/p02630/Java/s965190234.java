import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int q = scn.nextInt();
		while (q-- > 0) {
			int b = scn.nextInt();
			int c = scn.nextInt();
			Val(arr, b, c);
			long sum = SumOfArray(arr);
			System.out.println(sum);
		}

	}

	public static void Val(int[] arr, int b, int c) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int a = arr[i];
			if (a == b) {
				arr[i] = c;
			}
		}
	}

	public static long SumOfArray(int[] arr) {
		int n = arr.length;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
