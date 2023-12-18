import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static long MOD = 1000000007;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		char[] s = sc.next().toCharArray();
		sc.close();
		int[] p = new int[10];
		Arrays.fill(p, -1);
		for (i = 0; i < n; i++) {
			p[(int)(s[i]-'0')]=i;
		}
		HashSet<String> set = new HashSet<>();
		char[] tmp = new char[3];
		for (i = 0; i < n-2; i++) {
			for (j = i+1; j < n-1; j++) {
				for (k = 0; k < 10; k++) {
					if(p[k]>j) {
						tmp[0] =  s[i];
						tmp[1] =  s[j];
						tmp[2] =  (char)('0'+k);
						set.add(String.valueOf(tmp));
					}
				}
			}
		}
		out.println(set.size());
	}
}
