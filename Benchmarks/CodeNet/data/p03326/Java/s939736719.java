import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] XpYpZp = new long[N];
		long[] XmYpZp = new long[N];
		long[] XmYpZm = new long[N];
		long[] XmYmZp = new long[N];
		long[] XpYmZp = new long[N];
		long[] XpYmZm = new long[N];
		long[] XpYpZm = new long[N];
		long[] XmYmZm = new long[N];
		for (int i = 0; i < N; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			long z = sc.nextLong();
			XpYpZp[i] = x + y + z;
			XmYpZp[i] = (-x) + y + z;
			XmYmZp[i] = (-x) + (-y) + z;
			XmYmZm[i] = (-x) + (-y) + (-z);
			XpYmZp[i] = x + (-y) + z;
			XpYmZm[i] = x + (-y) + (-z);
			XmYpZm[i] = (-x) + y + (-z);
			XpYpZm[i] = x + y + (-z);
		}
		
		Arrays.sort(XpYpZp);
		Arrays.sort(XmYpZp);
		Arrays.sort(XmYmZp);
		Arrays.sort(XmYmZm);
		Arrays.sort(XpYmZm);
		Arrays.sort(XpYmZp);
		Arrays.sort(XmYpZm);
		Arrays.sort(XpYpZm);
		
		long[][] bigmap = new long[8][N];
		bigmap[0] = XpYpZp;
		bigmap[1] = XmYpZp;
		bigmap[2] = XmYmZp;
		bigmap[3] = XmYmZm;
		bigmap[4] = XpYmZm;
		bigmap[5] = XpYmZp;
		bigmap[6] = XmYpZm;
		bigmap[7] = XpYpZm;
		
		long ans = 0;
		for (int i = 0; i < 8; i++) {
			ans = Math.max(ans, calc(bigmap[i], M));
		}
		
		System.out.println(ans);
		
	}
	
	public static long calc(long[] map, int M) {
		int pos = map.length - 1;
		long ret = 0;
		for (int i = M; i > 0; i--) {
			ret += map[pos];
			pos--;
		}
		return ret;
	}
	
}