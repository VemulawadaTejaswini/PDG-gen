import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			sum += input[i];
		}
		int minValue = Integer.MAX_VALUE;
		int sum1 = 0;
		for (int i = 0; i < input.length; i++) {
			sum1 += input[i];
			sum -= input[i];
			int diff = Math.abs(sum - sum1);
			if (diff < minValue) {
				minValue = diff;
			} else {
				System.out.print(minValue);
				break;
			}
		}
	}
}
