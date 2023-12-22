import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
        int x = in.nextInt();
        out.println(x*x*x);
        out.flush();
        in.close();
	}
}