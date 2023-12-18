import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];

		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int n[] = new int[4];

		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 4; j++) {
				if (a[i]== j) {
					n[j-1]++;
				}
				if (b[i]==j) {
					n[j-1]++;
				}
			}
		}

		Arrays.sort(n);
		if (n[3] >= 3) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
