import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long sum = (N - 1) * N / 2;
		System.out.println(sum);
	}
}