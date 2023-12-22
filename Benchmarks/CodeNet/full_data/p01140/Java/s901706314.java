
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
			if((n|m)==0) break;
			int h[] = new int[n+1], w[] = new int[m+1];
			for(int i=0;i<n;i++) h[i+1] = sc.nextInt() + h[i];
			for(int j=0;j<m;j++) w[j+1] = sc.nextInt() + w[j];
			short[] len = new short[1500 * 1000 + 1];
			
			for(int i=0;i<n;i++) for(int j=i+1;j<=n;j++) len[h[j] - h[i]]++;
			int cnt = 0;
			for(int i=0;i<m;i++) for(int j=i+1;j<=m;j++) 
				cnt += len[w[j] - w[i]];
			System.out.println(cnt);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}