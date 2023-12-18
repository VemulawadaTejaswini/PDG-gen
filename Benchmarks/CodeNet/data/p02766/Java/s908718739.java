import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long count = 0L;
		while (n > 0) {
			++count;
			n /= k;
		}
		System.out.println(count);
	}
}
