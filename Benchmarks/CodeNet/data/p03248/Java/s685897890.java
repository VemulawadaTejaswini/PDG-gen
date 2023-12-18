import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		char[] s = sc.next().toCharArray();
		int N = s.length;
		
		int[] parent = makeTree(s, N);
		if(parent==null) {
			pw.println(-1);
		} else {
			for(int i=0; i<N; i++) {
				if(parent[i]<0)
					continue;
				pw.println((i+1) + " " + (parent[i]+1));
			}
		}
		sc.close();
		pw.close();
	}
	
	static int[] makeTree(char[] s, int N) {
		if(s[N-1]=='1' || s[0]=='0' || s[N-2]=='0')
			return null;
		for(int i=1; i<N/2; i++)
			if(s[i]!=s[N-i-2])
				return null;
		
		int[] ans = new int[N];
		int p = 0;
		ans[1] = 0;
		for(int i=2; i<N/2; i++) {
			if(s[i-1]=='1') {
				ans[p] = i;
				p = i;
			} else {
				ans[i] = p;
			}
		}
		for(int i=N/2; i<N; i++)
			ans[i] = p;
		ans[p] = -1;
		return ans;
	}
}
