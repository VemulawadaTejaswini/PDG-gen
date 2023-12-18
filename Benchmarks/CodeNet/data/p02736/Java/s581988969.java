import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arr = new int[N];
		String x = input.next();
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(x.substring(i,i+1));
		}
		while (N>0) {
			N--;
			for (int i = 0; i < N; i++) {
				arr[i] = Math.abs(arr[i]-arr[i+1]);
			}
		}
		System.out.println(arr[0]);
	}
}