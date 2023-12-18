import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
//		long n = parseLong(sc.next());
		int n = parseInt(sc.next());
		int[] l = new int[n];
		for(i=0;i<n;i++) {
			l[i] = parseInt(sc.next());
		}
		sc.close();
		long cnt = 0;
		for (i = 0; i < n; i++) {
			for (j = i+1; j < n; j++) {
				for (k = j+1; k < n; k++) {
					if(l[i]<l[j]+l[k]
					&& l[j]<l[k]+l[i]
					&& l[k]<l[i]+l[j]) cnt++;
				}
			}
		}
		out.println(cnt);
	}
}
