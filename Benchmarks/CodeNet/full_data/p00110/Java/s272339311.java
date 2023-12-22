
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			String formula = sc.next();
			String[] str = formula.split("[ + = ]");
			boolean f = true;
			for(String s: str) f &= s.charAt(0) != 'X';
			int i=0;
			for(i=f? 0: 1;i<10;i++) {
				if(isequal(formula, i)) break;
			}
			System.out.println((i==10? "NA": i));
		}
	}
	
	boolean isequal(String formula, int i) {
		String[] s = formula.replace('X', (char) (i+'0')).split("[ + = ]");
		return Integer.valueOf(s[0]) + Integer.valueOf(s[1]) == Integer.valueOf(s[2]);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}