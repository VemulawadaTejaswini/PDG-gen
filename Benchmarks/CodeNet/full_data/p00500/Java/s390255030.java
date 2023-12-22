import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][3];
		for(int i=0;i<n;i++) for(int j=0;j<3;j++) a[i][j] = sc.nextInt();
		for(int i=0;i<3;i++) for(int j=0;j<n;j++) {
			boolean f = false;
			for(int k=j+1;k<n;k++) if(a[j][i] == a[k][i]) { a[k][i] = 0; f = true; }
			if(f) a[j][i] = 0;
		}
		for(int i=0;i<n;i++) System.out.println((a[i][0]+a[i][1]+a[i][2]));
		
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}