import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int N;
    private int[] x;
    private int[] y;
    private int[] t;

    public Main() {
	N = Integer.parseInt(scan.next());

	x = new int[N+1];
	y = new int[N+1];
	t = new int[N+1];
	
	for (int i = 0; i < N; i++) {
	    t[i+1] = Integer.parseInt(scan.next());
	    x[i+1] = Integer.parseInt(scan.next());
	    y[i+1] = Integer.parseInt(scan.next());
	}

	scan.close();
    }

    public final void answer() {

	String ans = "Yes";
	for (int i = 0; i < N; i++) {
	    int dx = distance(x[i], y[i], x[i+1], y[i+1]);
	    int dt = t[i+1] - t[i];
	    if( dx > dt || (dt - dx) % 2 != 0) {
		ans = "No";
		break;
	    }
	}

	System.out.println(ans);
	
    }

    private int distance(int x1, int y1, int x2, int y2) {
	return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
}
