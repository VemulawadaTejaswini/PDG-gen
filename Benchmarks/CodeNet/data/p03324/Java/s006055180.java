import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int answer = 0;

		answer = (int)Math.pow(100, D) * (N + N / 100);

		System.out.println(answer);
	}
}
