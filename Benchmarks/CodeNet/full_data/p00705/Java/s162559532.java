import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt(), q = sc.nextInt();
			if( (n|q) == 0 ) break;
			int[] cnt = new int[101];
			for(int i=0;i<n;i++) {
				int m = sc.nextInt();
				for(int j=0;j<m;j++) cnt[sc.nextInt()]++;
			}
			int ans = 0; cnt[0] = q-1;
			for(int i=1;i<101;i++) if(cnt[i] > cnt[ans]) ans = i;
			System.out.println( ans );
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}