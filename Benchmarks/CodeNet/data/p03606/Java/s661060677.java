
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final int N;
    private int ans = 0;

    public Main() {
	N = Integer.parseInt(scan.next());
	
	for (int i = 0; i < N; i++) {
	    int l = Integer.parseInt(scan.next());
	    int r = Integer.parseInt(scan.next());

	    ans += r-l+1;
	}

	scan.close();
    }

    public final void answer() {
	System.out.println(ans);
    }
}
