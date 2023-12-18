import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();

		int[] s = new int[S.length()];
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i) == '0') {
				s[i] = 0;
			}else {
				s[i] = 1;
			}
		}

		int a = 0;

		int ans0=0;
		int ans1=0;
		for(int i=0;i<s.length;i++) {
			if(s[i] == a) {
				ans1++;
			}else {
				ans0++;
			}

			a ^= 1;

		}

		out.println(Math.min(ans0, ans1));

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
