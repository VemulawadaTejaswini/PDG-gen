
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
		int n = sc.nextInt();
		if(n == 0) break;
		boolean[] taro = new boolean[2*n+1], hanako = new boolean[2*n+1];
		fill(hanako, true);
		hanako[0] = false;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			taro[a] = true; hanako[a] = false;
		}
		
		int t = n, h = n, v = 0;
		int tp = 0, hp = 0;
		boolean isTaro = true;
		for(;t>0 && h>0;) {
			int i = v + 1;
			if(isTaro) {
				for(;i<=2*n;i++) if(taro[i]) {
					taro[i] = false;
					v = i;
					isTaro ^= true;
					t--;
					break;
				}
			}
			else {
				for(;i<=2*n;i++) if(hanako[i]) {
					hanako[i] = false;
					v = i;
					isTaro ^= true;
					h--;
					break;
				}
			}
			if(i == 2*n+1) {
				isTaro ^= true;
				v = 0;
			}
		}
		System.out.println(h);
		System.out.println(t);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}