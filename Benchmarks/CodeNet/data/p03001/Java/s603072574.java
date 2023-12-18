import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();

		out.print((W*H)/2.0);
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
