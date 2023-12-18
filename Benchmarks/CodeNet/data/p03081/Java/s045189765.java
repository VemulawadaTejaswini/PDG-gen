import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] ss = new int[N];
		for(int i=0; i<N; i++)
			ss[i] = s[i]-'A';
		
		int[] t = new int[Q];
		int[] d = new int[Q];
		for(int i=0; i<Q; i++) {
			t[i] = sc.next().toCharArray()[0]-'A';
			d[i] = sc.next().equals("L") ? -1 : 1;
		}
		
		int ll = -1;
		int lr = N;
		while(ll+1 < lr) {
			int mid = (ll+lr)/2;
			if(exceedLeft(N, ss, Q, t, d, mid))
				ll = mid;
			else
				lr = mid;
		}
		int rl = -1;
		int rr = N;
		while(rl+1 < rr) {
			int mid = (rl+rr)/2;
			if(exceedRight(N, ss, Q, t, d, mid))
				rr = mid;
			else
				rl = mid;
		}
		
		System.out.println(rr-lr);
		sc.close();
	}
	
	static boolean exceedLeft(int N, int[] s, int Q, int[] t, int[] d, int p) {
		for(int i=0; i<Q; i++) {
			if(s[p] == t[i]) {
				if(d[i]==1) {
					if(p==N-1)
						return false;
					p++;
				} else {
					if(p==0)
						return true;
					p--;
				}
			}
		}
		
		return false;
	}
	static boolean exceedRight(int N, int[] s, int Q, int[] t, int[] d, int p) {
		for(int i=0; i<Q; i++) {
			if(s[p] == t[i]) {
				if(d[i]==1) {
					if(p==N-1)
						return true;
					p++;
				} else {
					if(p==0)
						return false;
					p--;
				}
			}
		}
		
		return false;
	}
}
