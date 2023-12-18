import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] a = new String[h];
		for (int i = 0;i < h;i++) a[i] = sc.next();
		p(w);
		for (int i = 0;i < h;i++) {
			System.out.print("#");
			System.out.print(a[i]);
			System.out.println("#");
		}
		p(w);
	}

	public static void p(int w) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i < w+2;i++) sb.append("#");
		System.out.println(sb.toString());
	}
}
