
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
		int n = sc.nextInt(), m = sc.nextInt();
		String a = "";
		String s1 = "", s2 = "";
		int x = 0;
		for (int i=0;i<n;i++) a += sc.nextInt();
		for (int j=0;j<m;j++) {
			for (int k=0, p=sc.nextInt();k<p;k++) {
				s1 += x; s2 += 1 -x;
			}
			x = 1-x;
		}
		
		System.out.println(min(len(a, s1), len(a, s2)));
	}
	
	int len (String a, String b) {
		int l = a.length(), n = 0;
		int[] A = new int[l], B = new int[l];
		for (int i=0;i<l;i++) A[i] = a.charAt(i) - '0';
		for (int i=0;i<l;i++) B[i] = b.charAt(i) - '0';
		for (int i=0;i<l;i++) {
			if (A[i] == 1) n++;
			if (B[i] == 1) n--;
		}
		if (n != 0) return INF;
		int t = 0, cnt = 0;
		for (int i=0;i<l;i++) {
			for (int j=i;j<l;j++) {
				if (A[i] == B[j]) {
					int tmp = A[i];
					A[i] = A[j];
					A[j] = tmp;
					break;
				} else {
					cnt++;
				}
			}
		}
//		debug(A, B, cnt);
		return cnt;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}