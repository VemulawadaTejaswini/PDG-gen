import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		final String AC = "AC";
		final String WA = "WA";

		int N = in.nextInt();
		int M = in.nextInt();

		boolean[] accepteds = new boolean[N];
		int[] waCnts = new int[N];
		int acCnt = 0;
		int waCnt = 0;

		for(int i=0; i < M; i++) {
			if (acCnt == N) break;

			int p = in.nextInt();
			boolean isAc = in.next().equals(AC);
			int idx = p-1;
			if (accepteds[idx]) continue;

			if (isAc) {
				acCnt++;
				waCnt += waCnts[idx];
				accepteds[idx] = true;
			} else {
				waCnts[idx]++;
			}
		}

		System.out.println(acCnt + " " + waCnt);

	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}