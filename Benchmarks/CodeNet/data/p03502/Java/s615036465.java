import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int f = 0;
		int tmp = N;
		while (0 < tmp) {
			f += tmp % 10;
			tmp /= 10;
		}
		if (N % f == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}