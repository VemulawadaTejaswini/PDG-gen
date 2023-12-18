import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		int res = 0;
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
			res += input[i];
		}
		res *= res;
		for (int i = 0; i < N; i++) {
			res -= input[i] * input[i];
		}
		System.out.println(res / 2);
	}
}
