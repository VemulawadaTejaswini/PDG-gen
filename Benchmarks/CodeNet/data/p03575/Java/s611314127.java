import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class Main {
	public static boolean[] node;
	public static int n;
	public static int m;
	public static int[][] ab;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		n = parseInt(sc.next());
		m = parseInt(sc.next());
		ab = new int[m][2];
		for(i=0;i<m;i++) {
			ab[i][0] = parseInt(sc.next());
			ab[i][1] = parseInt(sc.next());
		}
		sc.close();
		int cnt=0;
		for (i = 0; i < m; i++) {
			node = new boolean[n];
			chkBridge(1, i);
			boolean f=false;
			for (j = 0; j < n; j++) {
				if(!node[j]) {
					f=true;
					break;
				}
			}
			if(f)cnt++;
		}
		out.println(cnt);
	}
	public static void chkBridge(int nd, int skip) {
		if(node[nd-1]) return;
		node[nd-1]=true;
		for (int i = 0; i < m; i++) {
			if(i==skip) continue;
			if(ab[i][0]==nd) chkBridge(ab[i][1], skip);
			if(ab[i][1]==nd) chkBridge(ab[i][0], skip);
		}
	}
}
