import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static long[] cards;
	static long[][] jyouken;
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		cards=new long[N];
		for(int i=0; i<N; i++) {
			cards[i]=sc.nextLong();
		}
		Arrays.sort(cards);
		jyouken=new long[M][2];
		for(int i=0; i<M; i++) {
			jyouken[i][0]=sc.nextLong();
			jyouken[i][1]=sc.nextLong();
		}
		/*
		 * 変更できるのが充分でかい場合全部して
		 * そうでなければ一部だけ
		 */
		quick_sort(jyouken,0,M-1);
		//これ二分探索だわ
		long tmp=cards[N-1];
		long sum=0;
		for(int i=M-1; i>=0; i--) {
			if(jyouken[i][1]>=tmp) {
				sum+=jyouken[i][0];
			}
		}
		if(sum>=N) {	//更新できるものが沢山の時
			long ans=0;
			long cnt=0;
			for(int i=M-1; i>=0; i--) {
				if(cnt<N) {
					if(cnt+jyouken[i][0]<=N) {
						ans+=jyouken[i][0]*jyouken[i][1];
						cnt+=jyouken[i][0];
					}
					else if(cnt+jyouken[i][0]>N) {
						ans+=jyouken[i][1]*(((long)N)-cnt);
						cnt=N;
					}
				}
				else {
					break;
				}
			}
			pl(ans);
		}
		else {
			int counter=0;
			for(int i=M-1; i>=0; i--) {
				if(counter<N) {
					for(int j=0; j<jyouken[i][0]; j++) {
						if(counter<N) {
							if(cards[counter]<jyouken[i][1]) {
								cards[counter]=jyouken[i][1];
								counter++;
							}
							else {
								break;
							}
						}
						else {
							break;
						}
					}
				}
				else {
					break;
				}
			}
			long ans=0;
			for(int i=0; i<N; i++) {
				ans+=cards[i];
			}
			pl(ans);
			/*for(int i=0; i<N; i++) {
				pl(cards[i]);
			}*/
		}
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
}