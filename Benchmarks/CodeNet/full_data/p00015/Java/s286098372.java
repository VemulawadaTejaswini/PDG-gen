import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[] = new int[81];
		int b[] = new int[81];
		int c[] = new int[81];

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 81; j++) {
				a[j] = 0;
				b[j] = 0;
				c[j] = 0;
			}
			String st = sc.next();
			for (int j = st.length() - 1; 0 <= j; j--) {
				a[80 - st.length() + j + 1] = st.charAt(j) - '0';
			}
			st = sc.next();
			for (int j = st.length() - 1; 0 <= j; j--) {
				b[80 - st.length() + j + 1] = st.charAt(j) - '0';
			}
			f(a, b, c, 80);
			for (int j = 0; j < 81; j++) {
				if (c[j] != 0) {
					for (int k = j; k < 81; k++) {
						System.out.print(c[k]);
					}
					break;
				}
			}
			System.out.println();
		}
	}

	public static void f(int a[], int b[], int c[], int k) {
		if (k < 0) {
			return ;
		}
		c[k] += (a[k] + b[k]);
		if (10 <= c[k]) {
			c[k] %= 10;
			c[k - 1]++;
		}
		f(a, b, c, k - 1);
	}
}