
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private List<Long> divisor(long n) {
		ArrayList<Long> l = new ArrayList<>();
		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				l.add(i);
				if (i * i != n) {
					l.add(n / i);
				}
			}
		}
		l.sort(Comparator.naturalOrder());
		return l;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long N = sc.nextLong();
		long ans = 0;


		for (long q : divisor(N)) {
			long m = N / q - 1;
			if (m != 0 && // q が N自身の場合m==0となる 
					N / m == N % m) {
				ans += m;
			}
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
