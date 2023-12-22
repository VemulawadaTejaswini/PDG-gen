import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st;
		int a[];
		int sum;

		a = new int[100];
		while (sc.hasNext()) {
			sum = 0;
			st = sc.next();
			for (int i = 0; i < st.length(); i++) {
				if (st.charAt(i) == 'I') a[i] = 1;
				if (st.charAt(i) == 'V') a[i] = 5;
				if (st.charAt(i) == 'X') a[i] = 10;
				if (st.charAt(i) == 'L') a[i] = 50;
				if (st.charAt(i) == 'C') a[i] = 100;
				if (st.charAt(i) == 'D') a[i] = 500;
				if (st.charAt(i) == 'M') a[i] = 1000;
				if (i != 0 && a[i - 1] < a[i]) {
					a[i] -= a[i - 1];
					a[i - 1] = 0;
				}
			}
			for (int i = 0; i < st.length(); i++) {
				sum += a[i];
			}
			System.out.println(sum);
		}
	}
}