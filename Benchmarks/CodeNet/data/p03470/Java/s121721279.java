import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int N;
    private int[] count = new int[101];

    public Main() {
	N = Integer.parseInt(scan.next());
	for (int i = 0; i < N; i++) {
	    int d = Integer.parseInt(scan.next());
	    count[d]++;
	}

	scan.close();
    }

    public final void answer() {
	long ans = Arrays.stream(count)
	    .filter(c -> c > 0)
	    .count();
	System.out.println(ans);
    }
}
