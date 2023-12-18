import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int res = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
				res++;
			}
		}
		System.out.print(res);
	}
}