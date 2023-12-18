
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final static long MOD = 1000_000_007L;
    private final int N;
    private final String S1;
    private final String S2;

    public Main() {
	N = Integer.parseInt(scan.next());
	S1 = scan.next();
	S2 = scan.next();

	scan.close();
    }

    public final void answer() {
	long ans = 1;
	Type present = null;
	Type previous = null;

	int index = 0;
	if(N > 1) {
	    previous = classify(index);
	    switch(previous) {
		case HOR:
		    ans = 6;
		    index += 2;
		    break;
		case VER:
		    ans = 3;
		    index++;
		    break;
	    }
	} else {
	    ans = 3;
	    index++;
	}

	for (; index < N; index++) {
	    if(index == N-1) {
		switch(previous) {
		    case HOR:
			break;
		    case VER:
			ans = ans * 2 % MOD;
			break;
		}
	    } else {
		present = classify(index);
		switch(present) {
		    case HOR:
			switch(previous) {
			    case HOR:
				ans = ans * 3 % MOD;
				break;
			    case VER:
				ans = ans * 2 % MOD;
				break;
			}
			index++;
			break;
		    case VER:
			switch(previous) {
			    case HOR:
				break;
			    case VER:
				ans = ans * 2 % MOD;
				break;
			}
			break;
		}
	    }

	    previous = present;
	}
	System.out.println(ans);
    }

    private Type classify(int index) {
	return S1.charAt(index) == S1.charAt(index+1) ? Type.HOR : Type.VER;
    }

    private static enum Type {
	VER,
	HOR,
    }
}
