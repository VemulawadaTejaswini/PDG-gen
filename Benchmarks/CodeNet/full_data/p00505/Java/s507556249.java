import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = 0, t = 0, e = 0, d = 0;
		int[] a = new int[3];
		while (true) {
			for (int i = 0; i < 3; i++) {
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			if (a[0] + a[1] > a[2]) {
				s++;
				if (a[0] * a[0] + a[1] * a[1] > a[2] * a[2]) {
					e++;
				}
				else if (a[0] * a[0] + a[1] * a[1] < a[2] * a[2]) {
					d++;
				}
				else {
					t++;
				}
			}
			else {
				break;
			}
		}
		System.out.println(s + " " + t + " " + e + " " + d);
	}

}

