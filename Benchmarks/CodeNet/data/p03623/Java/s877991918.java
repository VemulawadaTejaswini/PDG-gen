
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final int x;
    private final int a;
    private final int b;

    public Main() {
	x = Integer.parseInt(scan.next());
	a = Integer.parseInt(scan.next());
	b = Integer.parseInt(scan.next());

	scan.close();
    }

    public final void answer() {
	System.out.println(Math.abs(x-a) < Math.abs(x-b) ? "A" : "B");
    }
}
