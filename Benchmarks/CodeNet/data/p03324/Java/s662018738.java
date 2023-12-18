import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int[] b = { 1, 100, 10000 };
		System.out.println(b[D] * (N + (N / 100)));
	}
}
