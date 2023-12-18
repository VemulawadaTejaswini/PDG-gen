import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		final int n = Integer.parseInt(sc.next());
		final int m = Integer.parseInt(sc.next());
		if((n*m)%2 != 0){
			out.print("Yes");
		}else {
			out.print("No");
		}
		out.flush();
	}
}
