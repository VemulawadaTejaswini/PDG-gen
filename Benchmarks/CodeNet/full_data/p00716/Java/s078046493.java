import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for(int k=0;k<m;k++) {
			int c = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt(), max = c;
			for(int i=0;i<n;i++) {
				boolean f = sc.nextInt() == 1;
				double r = sc.nextDouble();
				int t = sc.nextInt();
				if( f ) {
					int cc = c;
					for(int j=0;j<y;j++) cc = (int)((1.0+r)*cc) - t;
					max = max(max, cc);
				}
				else {
					int cc = c, tmp = 0;
					for(int j=0;j<y;j++){ tmp += (int)(r*cc); cc -= t;} 
					max = max(max, cc+tmp);
				}
			}
			System.out.println(max);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}