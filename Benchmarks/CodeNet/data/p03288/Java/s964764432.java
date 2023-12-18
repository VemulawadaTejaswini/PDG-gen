import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int R = sc.nextInt();
		
		if(R < 1200) {
			out.println("ABC");
		}else if(R < 2800) {
			out.println("ARC");
		}else {
			out.println("AGC");
		}
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
