
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		int h = s.nextInt();
		int w = s.nextInt();
		int i = 0;
		String a = "";
		String b = "";

		String ary[] = new String[h];
		for (i = 0; i < h; i++) {
			ary[i] = "#" + s.next() + "#";

		}
		String ary1[] = new String[w + 2];

		for (i = 0; i < w + 2; i++) {
			ary1[i] = "#";

			a = a + ary1[i];

		}
		System.out.println(a);
		for (i = 0; i < h; i++) {
			System.out.println(ary[i]);
		}
		System.out.println(a);

	}

}