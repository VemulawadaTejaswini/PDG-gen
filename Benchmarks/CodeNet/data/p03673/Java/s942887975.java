import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		for (int i = 1; i < n; i++) {
			if (i % 2 > 0)
				s = s + " " + sc.next();
			else
				s = sc.next() + " " + s;
		}
		if (n % 2 == 0)
			s = new StringBuffer(s).reverse().toString();
		String[] a = s.split(" ");
		for (int i = 0; i < n - 1; i++)
			System.out.print(a[i] + " ");
		System.out.println(a[n - 1]);
	}
}