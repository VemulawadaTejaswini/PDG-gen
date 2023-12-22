
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
		for(;;) {
			int n = sc.nextInt(), m = sc.nextInt();
			if( (n|m) == 0 ) break;
			String[] t = new String[n]; int[] v = new int[n];
			String[] b = new String[m];
			for(int i=0;i<n;i++) {
				t[i] = sc.next(); v[i] = sc.nextInt();
			}
			for(int i=0;i<m;i++) b[i] = sc.next();
			
			int sum = 0;
			for(int i=0;i<n;i++) for(int h=0;h<m;h++){
				boolean flg = true;
				for(int j=0;j<8;j++) if(t[i].charAt(j) != '*' && t[i].charAt(j) != b[h].charAt(j))
					flg = false;
				if(flg) sum += v[i];
			}
			System.out.println(sum);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}