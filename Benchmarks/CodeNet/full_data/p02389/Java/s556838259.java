import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
        int x = Integer.parseInt(in.next());
        int y = Integer.parseInt(in.next());
        out.println(x*y+" "+(x*2+y*2));
        out.flush();
        in.close();
	}
}