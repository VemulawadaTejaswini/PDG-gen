import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] V=new long[N];
		long[] hidarikara=new long[N];
		long[] migikara=new long[N];
		long[][] houseki=new long[N+1][2];
		for(int i=0; i<N; i++) {
			V[i]=sc.nextLong();
			houseki[i][0]=V[i];
			houseki[i][1]=i;
		}
		quick_sort(houseki,0,N-1);
		for(int i=0; i<N; i++) {
			hidarikara[i]=V[i];
			migikara[i]=V[N-i-1];
		}

		long max=0;	//最大値
		ArrayList<Long> ten=new ArrayList<Long>();
		for(int i=0; i<=N; i++) {	//何個石を取る作業をするか
			long tmpsum=0;
			if(i<=K) {//取る操作だけでおわるか？
				for(int j=0; j<=i; j++) {
					tmpsum=0L;
					ten=new ArrayList<Long>();
					//左から j個、右から(i-j)個取る
					for(int k=0; k<j; k++) {
						ten.add(hidarikara[k]);
						tmpsum+=hidarikara[k];
					}
					for(int k=0; k<(i-j); k++) {
						ten.add(migikara[k]);
						tmpsum+=migikara[k];
					}
					Collections.sort(ten);
					int nokori=K-i;	//取り出してつぎにいろいろする
					for(int k=0; k<Math.min(ten.size(), nokori); k++) {
						long gets=ten.get(k);
						if(gets<0) {
							tmpsum-=gets;
						}
						else {
							break;
						}
					}
					max=Math.max(max,tmpsum);
				}
			}
			else {
				break;
			}
		}
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
}