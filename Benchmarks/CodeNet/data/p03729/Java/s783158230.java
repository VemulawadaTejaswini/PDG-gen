
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final String A;
    private final String B;
    private final String C;

    public Main() {
	A = scan.next();
	B = scan.next();
	C = scan.next();

	scan.close();
    }

    public final void answer() {
	System.out.println(A.charAt(A.length()-1) == B.charAt(0) && B.charAt(B.length()-1) == C.charAt(0) ? "YES" : "NO");
    }
}
