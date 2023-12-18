import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double answer = (double)(N - N / 2) / N;

		System.out.println(answer);
	}
}
