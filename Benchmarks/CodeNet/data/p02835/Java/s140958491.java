import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = Integer.parseInt(stdin.next());
		int A = Integer.parseInt(stdin.next());
		int B = Integer.parseInt(stdin.next());

		if(N+A+B >= 22) {
			out.println("bust");
		}
		else {
			out.println("win");
		}



		out.flush();
	}

}
