import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.PrintWriter;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		int q = parseInt(sc.next());
		int[] a = new int[q];
		for(i=0;i<q;i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		int[] s = new int[n+1];
//		for (i = 0; i < n; i++) {
//			s[i] = k;
//		}
		for (i = 0; i < q; i++) {
			s[a[i]-1]++;
		}
        PrintWriter pw = new PrintWriter(out);
		for (i = 0; i < n; i++) {
			if(k-q+s[i]>0) {
				pw.println("Yes");
			} else {
				pw.println("No");
			}
		}
		pw.flush();
	}
}
