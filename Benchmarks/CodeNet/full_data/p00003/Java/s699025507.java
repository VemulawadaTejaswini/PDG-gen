import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				a[j] = scan.nextInt();
			}

			Arrays.sort(a);
			System.out.println(a[2]*a[2]==a[0]*a[0]+a[1]*a[1] ? "YES" : "NO");
		}
	}
}