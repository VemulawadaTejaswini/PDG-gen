mport java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int[] p = new int[n];
		int[] q = new int[n];
		for(i=0;i<n;i++) {
			p[i] = parseInt(sc.next());
			q[i] = p[i];
		}
		sc.close();
		Arrays.sort(q);
		boolean f = true;
		int cnt = 0;
		for(i=0;i<n;i++) {
			if(p[i]!=q[i]) {
				cnt++;
				if(cnt >= 3) {
					f = false;
					break;
				}
			}
		}
		if(f)out.println("YES");
		else out.println("NO");
	}
}
