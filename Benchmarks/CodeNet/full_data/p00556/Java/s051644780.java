import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static HashMap<String,String> map = new HashMap<>();
	static int N;
	static int M;
	static int[] ar;
	static int[] c;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		ar = new int[N];
		c  = new int[M];
		for(int i = 0; i < N; i++) {
			ar[i] = sc.nextInt()-1;
			c[ar[i]]++;
		}
		int ans = dfs(0, new int[M], new boolean[M]);
		System.out.println(ans);
	}
	static int dfs(int id, int[] a, boolean[] b) {
		if(id == M) {
			int now = 0;
			int ret = 0;
			for(int i = 0; i < M; i++) {
				int cc = c[a[i]];
				for(int j = 0; j < cc; j++) {
					if(ar[j + now] != a[i]) ret++;
				}
				now += cc;
			}
			return ret;
		} else {
			int min = 2 << 29;
			for(int i = 0; i < M; i++) {
				if(b[i]) continue;
				b[i] = true;
				a[id] = i;
				min = Math.min(min, dfs(id+1,a,b));
				b[i] = false;
			}
			return min;
		}
	}
}