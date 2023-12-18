import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long W = sc.nextInt();
		long H = sc.nextInt();
		long x = sc.nextInt();
		long y = sc.nextInt();
		
		sc.close();

		String a = BigDecimal.valueOf(((double)W*H)/2.0).toPlainString();		
		out.print(a);
		out.print(" ");
		
		if(W == x*2 && H == y*2) {
			out.println("1");
		}else {
			out.println("0");
		}
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
