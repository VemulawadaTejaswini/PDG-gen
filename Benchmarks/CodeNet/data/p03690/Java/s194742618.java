import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int INF = 1000000;
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();
		for(int i=0; i<N; i++)
			b[i] = sc.nextInt();
		
		int ans = INF;
		
		int[] aa = new int[N+1];
		for(int i=0; i<N; i++) {
			aa[i] = a[i];
			aa[N] ^= a[i];
		}
		int xor = aa[N];
		Arrays.sort(aa);
		int[] bb = b.clone();
		Arrays.sort(bb);
		
		int idx = -1;
		boolean match=true;
		for(int i=0; i<N; i++) {
			if(aa[i + (idx<0 ? 0 : 1)]!=bb[i]) {
				if(idx<0) {
					idx = i;
					i--;
				} else {
					match=false;
					break;
				}
			}
		}
		
		if(match) {
			if(idx<0)
				idx = N;
			ans = 0;
			for(int i=0; i<N; i++) {
				if(a[i]!=b[i])
					ans++;
			}
			if(ans>0 && aa[idx]==xor)
				ans++;
		}
		
		System.out.println(ans<INF ? ans : -1);
		sc.close();
	}
}
