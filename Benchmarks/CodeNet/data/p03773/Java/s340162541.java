
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		out.println((A + B) % 24);
		
		sc.close();
		out.flush();
	}
}