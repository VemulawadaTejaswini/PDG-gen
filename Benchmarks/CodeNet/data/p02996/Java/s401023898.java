import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	Pair[] pair = new Pair[N];
	for (int i = 0; i < N; i++) {
	    pair[i] = new Pair(in.nextInt(), in.nextInt());
	}
	Arrays.sort(pair, (x, y) -> x.B - y.B);
	long time = 0;
	for(Pair p: pair) {
	    time += p.A;
	    if(time > p.B) {
		System.out.println("No");
		return;
	    }
	}
	System.out.println("Yes");
    }
}

class Pair {
    int A, B;
    public Pair(int A, int B) {
	this.A = A; this.B = B;
    }
}

