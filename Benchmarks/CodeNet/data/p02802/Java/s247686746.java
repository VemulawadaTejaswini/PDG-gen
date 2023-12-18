import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		int[] p = new int[m];
		String[] s = new String[m];
		for(i=0;i<m;i++) {
			p[i] = parseInt(sc.next());
			s[i] = sc.next();
		}
		sc.close();
		boolean[] acf = new boolean[n+1];
		int ac = 0;
		int wa = 0;
		for(i=0;i<m;i++) {
			if(s[i].equals("WA")) {
				if(!acf[p[i]]) {
					wa++;
				}
			} else {
				if(!acf[p[i]]) {
					ac++;
					acf[p[i]]=true;
				}
			}
		}
		out.printf("%d %d%n", ac, wa);
	}
	public static void factn(String s, String t, int n) {
		for (int i = 0; i < n; i++) {
			if(n==1) {
				list.add(parseInt(s + t));
			} else {
				factn(s+t.substring(i,i+1), t.substring(0,i)+(i!=n-1?t.substring(i+1,n):""), n-1);
			}
		}
	}
}
