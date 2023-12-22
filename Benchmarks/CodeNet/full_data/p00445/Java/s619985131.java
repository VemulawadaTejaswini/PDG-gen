
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			String str = sc.next();
			int joi = 0, ioi = 0;
			for(int i=2;i<str.length();i++) {
				if(str.charAt(i-2) == 'J' && str.charAt(i-1) == 'O' && str.charAt(i) == 'I')
					joi++;
				if(str.charAt(i-2) == 'I' && str.charAt(i-1) == 'O' && str.charAt(i) == 'I')
					ioi++;
			}
			System.out.println(joi); System.out.println(ioi);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}