import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[] a = sc.next().toCharArray();
		
		System.out.println(solve(N, a));
		sc.close();
	}
	
	static int solve(int N, char[] a) {
		int[] b = new int[N-1];
		boolean[] used = new boolean[3];
		for(int i=0; i<N-1; i++) {
			b[i] = Math.abs(a[i]-a[i+1]);
			used[b[i]] = true;
		}
		
		if(used[0] && used[1] && used[2]) {
			for(int i=0; i<N-1; i++) {
				if(b[i]==2)
					b[i] = 0;
			}
			return solve2(N-1, b);
		}
		if(used[0] && used[1] && !used[2]) {
			return solve2(N-1, b);
		}
		if(used[0] && !used[1] && used[2]) {
			for(int i=0; i<N-1; i++) {
				if(b[i]==2)
					b[i] = 1;
			}
			return solve2(N-1, b)*2;
		}
		if(!used[0] && used[1] && used[2]) {
			int[] c = new int[N-2];
			for(int i=0; i<N-2; i++) {
				c[i] = Math.abs(b[i]-b[i+1]);
			}
			return solve2(N-2, c);
		}
		if(N-1==1)
			return b[0];
		else
			return 0;
	}
	
	static int solve2(int N, int[] v) {
		int ans = 0;
		for(int i=0; i<N; i++) {
			if(v[i]==1)
				ans += get(N-1, N-i-1);
		}
		return ans%2;
	}
	
	static int get(int y, int x) {
		int v=1;
		while(v<=y)
			v<<=1;
		v>>=1;
		while(v>1) {
			y%=v;
			x%=v;
			if(y<x)
				return 0;
			v>>=1;
		}
		return 1;
	}
}
