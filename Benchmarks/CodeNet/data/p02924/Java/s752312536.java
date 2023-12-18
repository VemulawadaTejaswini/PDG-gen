import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0L;
		for (int i = 1; i < n; i++) {
			sum += i % (i + 1);
		}
		System.out.println(sum);
	}
}
