import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long t = Integer.parseInt(sc.next());
		long a = Integer.parseInt(sc.next());
		for (int i = 1; i < n; i++) {
			long tt = Integer.parseInt(sc.next());
			long ta = Integer.parseInt(sc.next());
			int mul = 1;
			while (tt * mul < t || ta * mul < a)
				mul++;
			t = tt * mul;
			a = ta * mul;
		}
		System.out.println(t + a);
	}
}