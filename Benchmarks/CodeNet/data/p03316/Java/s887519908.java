import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	
	
	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		sc.close();

		int s = 0;
		int n = N;
		while(n != 0) {
			s += n%10;
			n /= 10; 
		}
		
		if(N%s == 0) {
			out.println("Yes");
		}else {
			out.println("No");
		}
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
