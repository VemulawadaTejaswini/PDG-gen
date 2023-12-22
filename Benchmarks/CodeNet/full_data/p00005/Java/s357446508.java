

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String argv[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str;
		String Array[] = new String[2];
		long a, b, min, i;
		long saidaikouyakusu=0;
		while ((str = br.readLine()) != null) {
			Array = str.split(" ");
			a = Integer.parseInt(Array[0]);
			b = Integer.parseInt(Array[1]);
			if (a > b) {
				min = b;
			} else
				min = a;

			for (i = 2; i <= min/2; i++) {
				if (a % i == 0 && b % i == 0 && saidaikouyakusu<i)saidaikouyakusu=i;

			}
			System.out.printf("%d %d\n", saidaikouyakusu, a * b/saidaikouyakusu);

		}
	}

}