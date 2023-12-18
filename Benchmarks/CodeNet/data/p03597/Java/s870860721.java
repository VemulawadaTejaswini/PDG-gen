
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final int N;
    private final int A;

    public Main() {
	N = Integer.parseInt(scan.next());
	A = Integer.parseInt(scan.next());

	scan.close();
    }

    public final void answer() {
	System.out.println(N*N-A);
    }
}
