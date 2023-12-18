import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] e = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int q = sc.nextInt();
		int[] a = new int[q];
		int[] b = new int[q];
		int[] c = new int[q];
		int[] d = new int[q];
		for (int i = 0; i < q; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < q; i++) {
			String[] ss = new String[] { S.substring(a[i] - 1, b[i]),
					T.substring(c[i] - 1, d[i]) };
			int[] chk = new int[2];
			for (int j = 0; j <= 1; j++) {
				for (int k = 0; k < ss[j].length(); k++) {
					switch (ss[j].charAt(k)) {
					case 'A':
						chk[j] = (chk[j] + 1) % 3;
						break;
					case 'B':
						chk[j] = (chk[j] + 2) % 3;
						break;
					default:
						break;
					}
				}
			}
			if (chk[0] == chk[1]) {
				buf.append("YES\n");
			} else {
				buf.append("NO\n");
			}
		}

		System.out.println(buf.toString());
	}
}
