import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		/*
		 * 方針、できるだけ面積を小さくしたい
		 * 点の集合をXとY座標それぞれでソートしていく
		 * そこからスライド式に見ていくとよさそう
		 *
		 */
		int N=sc.nextInt();
		int K=sc.nextInt();
		long MIN_S=6_000_000_000_000_000_000L;
		long[][] coordx=new long[N][2];
		long[][] coordy=new long[N][2];
		for(int i=0; i<N; i++) {
			long xx=sc.nextLong();
			long yy=sc.nextLong();
			coordx[i][0]=xx;
			coordx[i][1]=yy;
			coordy[i][0]=yy;
			coordy[i][1]=xx;
		}
		quick_sort(coordx,0,N-1);
		quick_sort(coordy,0,N-1);

		for(int i=0; i<=N-K; i++) {
			long difx=coordx[i+K-1][0]-coordx[i][0];
			long miny=2_000_000_000_000L;
			long maxy=-2_000_000_000_000L;
			for(int j=0; j<K; j++) {
				miny=Math.min(miny, coordx[j][1]);
				maxy=Math.max(maxy, coordx[j][1]);
			}
			MIN_S=Math.min(MIN_S, difx*(maxy-miny));
		}

		for(int i=0; i<=N-K; i++) {
			long dify=coordy[i+K-1][0]-coordy[i][0];
			long minx=2_000_000_000_000L;
			long maxx=-2_000_000_000_000L;
			for(int j=0; j<K; j++) {
				minx=Math.min(minx, coordy[j][1]);
				maxx=Math.max(maxx, coordy[j][1]);
			}
			MIN_S=Math.min(MIN_S, dify*(maxx-minx));
		}
		pl(MIN_S);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static void quick_sort(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left, r = right;
		long tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}