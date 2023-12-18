
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int N;
    private static String s;

    public static void main(String[] args) {
	N = Integer.parseInt(scan.next());
	s = scan.next();

	String ans = check(true, true);
	if(ans.equals("-1")) ans = check(true, false);
	if(ans.equals("-1")) ans = check(false, true);
	if(ans.equals("-1")) ans = check(false, false);

	System.out.println(ans);
	scan.close();
    }

    private static boolean next(boolean p, boolean c, char say) {
	boolean state = (say == 'o' ? p : !p);
	return c ? state : !state;
    }

    private static String check(boolean p, boolean c) {
	boolean[] state = new boolean[N+1];
	state[0] = p;
	state[1] = c;

	for (int i = 1; i < N; i++) {
	    state[i+1] = next(state[i-1], state[i], s.charAt(i));
	}

	String ans = "-1";
	if(state[N] == state[0] && next(state[N-1], state[0], s.charAt(0)) == state[1]) {
	    StringBuilder str = new StringBuilder(N);
	    for (int i = 0; i < N; i++) {
		str.append(state[i] ? 'S' : 'W');
	    }
	    ans = str.toString();
	}
	return ans;
    }
}
