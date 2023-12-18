import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		int odd = 0;
		long even = 0;
		for (int i= 0; i < n; i++)
			if (Integer.parseInt(sc.next()) % 2 != 0)
				odd++;
			else
				even++;
		long a = (long)Math.pow(2, even);
		long b = 0;
		for (int i = 0; i <= odd; i += 2)
			b += combination(odd, i);
		if (p == 0)
			System.out.println(a * b);
		else
			System.out.println((long)Math.pow(2, n) - a * b);
	}
	public static long combination(int n, int r) {
		if (r == 0 || r == n)
			return 1;
		else if (r == 1)
			return n;
		return combination(n - 1, r - 1) + combination(n - 1, r);
	}
}