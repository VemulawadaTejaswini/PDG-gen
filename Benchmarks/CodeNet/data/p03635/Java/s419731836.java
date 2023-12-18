
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int n;
    private int m;

    public Main() {
	n = Integer.parseInt(scan.next());
	m = Integer.parseInt(scan.next());
	scan.close();
    }

    public final void answer() {
	System.out.println((n-1)*(m-1));
    }
}
