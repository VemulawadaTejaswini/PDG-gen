
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final int A;
    private final int B;
    private final int C;
    private final int D;

    public Main() {
	A = Integer.parseInt(scan.next());
	B = Integer.parseInt(scan.next());
	C = Integer.parseInt(scan.next());
	D = Integer.parseInt(scan.next());
	scan.close();
    }

    public final void answer() {
	int start = Integer.max(A, C);
	int end = Integer.min(B, D);
	int time = end - start;
	if(time < 0) time = 0;

	System.out.println(time);
    }
}
