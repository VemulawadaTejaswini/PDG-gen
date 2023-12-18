
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final int N;
    private final int[] A;

    public Main() {
	N = Integer.parseInt(scan.next());
	A = new int[N];

	for (int i = 0; i < N; i++) {
	    A[i] = Integer.parseInt(scan.next());
	}

	scan.close();
    }

    public final void answer() {
	Arrays.sort(A);

	int ans = 0;
	boolean add = false;
	int number = 0;

	for (int i = 0; i < N; i++) {
	    if(A[i] != number) {
		if(add) ans++;
		number = A[i];
		add = true;
	    } else {
		add = !add;
	    }
	}

	if(add) ans++;

	System.out.println(ans);
    }
}
