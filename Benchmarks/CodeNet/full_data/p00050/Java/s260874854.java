import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static String replace (String s1, int i, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 =s2.toCharArray();
		for (int j = 0; j < c2.length; j++)
			c1[i + j] = c2[j];
		return String.valueOf(c1);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		char[] c = br.readLine().toCharArray();
		char[] a = {'a','p','p','l','e'};
		char[] p = {'p','e','a','c','h'};

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i + j >= c.length) break;
				if (c[i + j] != a[j]) break;
				if (j == a.length - 1) {
					for (int k = 0; k < p.length; k++)
						c[i + k] = p[k];
					i++;
				}
			}
			for (int j = 0; j < p.length; j++) {
				if (i + j >= c.length) break;
				if (c[i + j] != p[j]) break;
				if (j == p.length - 1) {
					for (int k = 0; k < a.length; k++)
						c[i + k] = a[k];
				}
			}
		}
		System.out.println(String.valueOf(c));

	}

}