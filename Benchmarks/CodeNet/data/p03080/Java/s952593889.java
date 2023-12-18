import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		String s = sc.next();

		int r=0;
		int b=0;
		for(int i=0;i<n;i++) {
			char c = s.charAt(i);

			if(c=='R') {
				r++;
			}else {
				b++;
			}

		}
		if(r>b) {
			out.println("Yes");
		}else {
			out.println("No");

		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
