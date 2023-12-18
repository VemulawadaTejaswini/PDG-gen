import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st = sc.next();

		char[] c = st.toCharArray();
		int[] x = new int[st.length()];
		int kosu = Renzoku(c, x);
		int moto, saki;
		moto = 0;
		saki = kosu-1;
		if (c[0] == '.') {
			moto = 1;

		}
		if (c[n - 1] == '#') {
			saki--;
		}



		int min = 999999999;
		int ans = 0;
		for (int i = moto; i <= saki; i = i + 2) {
			// System.out.println();
			// System.out.println("i"+i);
			for (int j = moto; j <= saki; j = j + 2) {
				if (j == i) {
					j++;
				}
				 ans += x[j];
				// System.out.println("j"+j);

			}
			if (ans < min) {
				min = ans;
			}
			ans = 0;
		}
		System.out.println();
		 System.out.println(min);


	}

	public static int Renzoku(char c[], int x[]) {

		int mode = 0;
		int val = 0;

		for (int i = 0; i <= c.length - 2; i++) {
			if ((c[i] == c[i + 1]) && i != c.length - 2) {
				val++;
			} else {
				if ((c[i] == c[i + 1]) && i == c.length - 2) {
					val++;
				}
				val++;
				x[mode] = val;
				mode++;

				if ((c[i] != c[i + 1]) && i == c.length - 2) {
					x[mode] = 1;
					mode++;
				}

				val = 0;
			}

		}
		return mode;

	}
}