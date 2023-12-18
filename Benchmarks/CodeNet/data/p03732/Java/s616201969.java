import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		long W=sc.nextLong();
		long[][] mono=new long[N][2];
		for(int i=0; i<N; i++) {
			mono[i][0]=sc.nextLong();
			mono[i][1]=sc.nextLong();
		}
		quick_sort(mono,0,N-1);
		long min0=mono[0][0];
		boolean[] sina= {false,false,false,false};
		for(int i=0; i<N; i++) {
			sina[(int)(mono[i][0]-min0)]=true;
		}
		int kazu=0;
		for(int i=0; i<4; i++) {
			if(sina[i]) {
				kazu++;
			}
		}
		long[][][] taiou=new long[4][101][2];
		int[] counter= {0,0,0,0};
		for(int i=0; i<N; i++) {
			taiou[(int)(mono[i][0]-min0)][counter[(int)(mono[i][0]-min0)]][0]=mono[i][0];
			taiou[(int)(mono[i][0]-min0)][counter[(int)(mono[i][0]-min0)]][1]=mono[i][1];
			counter[(int)(mono[i][0]-min0)]++;
		}
		for(int i=0; i<4; i++) {
			quick_sort(taiou[i],0,counter[i]-1);
		}
		//pl("A");
		int[] tmp= {1,1,1,1};
		long[][][] ruiseki=new long[4][102][2];
		for(int i=0; i<4; i++) {
			for(int j=counter[i]-1; j>=0; j--) {
				ruiseki[i][tmp[i]][0]=taiou[i][j][0];
				ruiseki[i][tmp[i]][1]=-taiou[i][j][1];
				tmp[i]++;
			}
		}
		for(int i=0; i<4; i++) {
			quick_sort2(ruiseki[i],1,counter[i]);
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<=100; j++) {
				ruiseki[i][j][1]*=-1;
			}
		}
		//pl("B");
		for(int i=0; i<4; i++) {
			for(int j=1; j<tmp[i]; j++) {
				ruiseki[i][j][0]+=ruiseki[i][j-1][0];
				ruiseki[i][j][1]+=ruiseki[i][j-1][1];
			}
		}
		//pl("C");
		for(int i=0; i<4; i++) {
			for(int j=0; j<tmp[i]; j++) {
				//pl(ruiseki[i][j][0]+" "+ruiseki[i][j][1]);
			}
		}
		//pl(counter[0]+" "+counter[1]+" "+counter[2]+" "+counter[3]);
		long max=0;
		for(int i=0; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				for(int k=0; k<=100; k++) {
					for(int l=0; l<=100; l++) {
						//pl(i+" "+j+" "+k+" "+l);
						long omosa=ruiseki[0][i][0]+ruiseki[1][j][0]+ruiseki[2][k][0]+ruiseki[3][l][0];
						if(omosa<=W) {
							max=Math.max(ruiseki[0][i][1]+ruiseki[1][j][1]+ruiseki[2][k][1]+ruiseki[3][l][1],max);
						}
					}
				}
			}
		}
		//pl("D");
		pl(max);
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
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
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
	static void quick_sort2(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][1];
		int l = left, r = right;
		long tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][1] < p) { l++; }
			while(d[r][1] > p) { r--; }
			if (l<=r) {
				tmp = d[l][1]; d[l][1] = d[r][1]; d[r][1] = tmp;
				tmp1=d[l][0]; tmp2=d[r][0]; d[l][0]=tmp2; d[r][0]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
	static void quick_sort(int[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		int p = d[(left+right)/2][0];
		int l = left, r = right;
		int tmp,tmp1,tmp2;
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