import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		int[] absx = new int[N];
		for(int i = 0;i < N;++i) {
			x[i] = sc.nextInt();
			absx[i] = Math.abs(x[i]);
		}
		sc.close();
		
		int p0 = 0;
		for(int i = 0;i < N;++i) {
			if(x[i] >= 0) {
				p0 = i;
				break;
			}
		}
		
		int ncount = 0;
		int pcount = 0;
		for(int i = 0;i < K;++i) {
			if(p0 - ncount == 0) {
				pcount++;
			}else if(p0 + pcount == N-1) {
				ncount++;
			}else if(absx[p0 - ncount - 1] > absx[p0 + pcount]) {
				//System.out.println("p" + absx[p0 - ncount - 1] + ":" + absx[p0 + pcount]);
				pcount++;
			}else {
				//System.out.println("n" + absx[p0 - ncount - 1] + ":" + absx[p0 + pcount]);
				ncount++;
			}
		}
		//System.out.println(ncount + ":" + pcount);
		
		int ans = 0;
		if(pcount == 0) {
			ans = absx[p0-ncount];
		}else if(ncount == 0) {
			ans = absx[p0+pcount-1];
		}else if(absx[p0 - ncount] > absx[p0 + pcount - 1]) {
			ans = absx[p0+pcount - 1] * 2 + absx[p0-ncount];
		}else {
			ans = absx[p0-ncount] * 2 + absx[p0+pcount - 1];
		}
		
		if(p0 + K < N)
			if(ans > absx[p0 + K - 1])
				ans = absx[p0+K-1];
		if(p0 - K >= 0)
			if(ans > absx[p0 - K])
				ans = absx[p0 - K];
		System.out.println(ans);
	}
}
