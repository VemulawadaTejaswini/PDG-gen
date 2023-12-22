import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Q = sc.nextInt();

		int[] a = new int[Q];
		int[] b = new int[Q];
		int[] c = new int[Q];
		int[] d = new int[Q];

		for(int i=0; i<Q; i++) {
			a[i] = sc.nextInt()-1;
			b[i] = sc.nextInt()-1;
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		long ans = 0;
		int[] v = new int[N];
		v[0] = 1;
		long comb = (1<<(M-1))-1;
		while(comb < 1<<(M-1)+(N-1)) {
			int cur = v[0];
			int index = 1;
			for(int i=0; i<M-1+N-1; i++) {
				if(((1l<<i)&comb) != 0) {
					cur++;
				} else {
					v[index] = cur;
					index++;
				}
			}
			
			long score = 0;
			for(int i=0; i<Q; i++) {
				if(v[b[i]]-v[a[i]]==c[i])
					score += d[i];
			}
			ans = Math.max(ans, score);
			
			long x = comb & -comb;
			long y = comb+x;
			comb = ((comb & ~y)/ x>>1) | y;
		}

		System.out.println(ans);
		sc.close();
	}
}
