import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int l = sc.nextInt();
		int r = sc.nextInt();
		if (r - l >= 2018) {
			System.out.println(0);
		} else {
			int a[] = new int[r - l + 1];
			for (int i = 0; i <= r - l; i++) {
				a[i] = (l + i) % 2019;
			}
			Arrays.sort(a);
			System.out.println((a[0] * a[1]) % 2019);
		}
	}
}
