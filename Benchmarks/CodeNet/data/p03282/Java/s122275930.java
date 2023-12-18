import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();
		long K = sc.nextLong();
		sc.close();
		
		for(int i=0;i<Math.min(S.length(),K);i++) {
			if(S.charAt(i) != '1') {
				out.println(S.charAt(i));
				return;
			}
		}
		out.println("1");

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
