import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int N;
    private int Y;

    public Main() {
	N = Integer.parseInt(scan.next());
	Y = Integer.parseInt(scan.next());

	scan.close();
    }

    public final void answer() {

	boolean notexist = true;

	outside: for (int x = 0; x <= N; x++) {
	    for (int y = 0; y <=  N-x; y++) {
		int z = N - x - y;
		if(exist(x, y, z)) {
		    System.out.println(x + " " + y + " " + z);
		    notexist = false;
		    break outside;
		}
	    }
	}

	if(notexist) System.out.println("-1 -1 -1");
    }

    private boolean exist(int x, int y, int z) {
	return x*10000 + y*5000 + z*1000 == Y;
    }
}
