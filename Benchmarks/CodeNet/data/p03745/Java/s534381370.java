import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
		int res = 0;
		boolean increase = true;
		for (int i = 0; i < n; i++) {
			if (i != 0 && arr[i] >= arr[i-1]) {
				if (!increase) {
					res++;
					increase = !increase;
					i++;
				}
			} 
			if (i != 0 && arr[i] <= arr[i-1]) {
				if (increase) {
					res++;
					increase = !increase;
					i++;
				}
			}
		}
		System.out.println(res+1);
	}
}