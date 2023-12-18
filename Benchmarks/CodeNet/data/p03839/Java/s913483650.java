import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		/*
		 * 連続するK個数。　好きな回数だけ操作できる
		 * では、好きな回数操作しても意のままにならないような条件とは？
		 * それは両端。（のうち片方に寄せられる）
		 * それ以外の場所は工夫して塗ることで選択性を持つことができる
		 */
		int N=sc.nextInt();
		int K=sc.nextInt();
		long[] ten=new long[N];
		long sum=0;
		for(int i=0; i<N; i++) {
			ten[i]=sc.nextLong();
			sum+=ten[i];
		}
		/*
		 * しゃくとり法を右に、左に計2階行うことでとけそう
		 */
		long utan=0;
		long satan=0;
		for(int i=0; i<K; i++) {
			satan+=ten[i];
			utan+=ten[N-1-i];
		}
		int right=0;
		long tmp=0;
		long tmp2=0;
		long tmp3=0;
		long tmp4=0;
		for(int left=0; left<Math.max(N-K-1,0); left++) {
			//pl(ten[right]);
			if(right<Math.max(0, N-K-1) && ten[right]>=0) {
				tmp+=ten[right];
				//pl(tmp);
				right++;
			}
		}
		if(utan>0) {
			tmp+=utan;
		}
		long[] rev=new long[N];
		for(int i=0; i<N; i++) {
			rev[N-1-i]=ten[i];
		}
		right=0;
		for(int left=0; left<Math.max(N-K-1,0); left++) {
			if(right<Math.max(0, N-K-1) && rev[right]>=0) {
				tmp2+=rev[right];
				right++;
			}
		}
		if(satan>0) {
			tmp2+=satan;
		}

		tmp3=sum;
		right=0;
		for(int left=0; left<Math.max(N-K-1,0); left++) {
			//pl(ten[right]);
			if(right<Math.max(0, N-K-1) && ten[right]<0) {
				tmp3-=ten[right];
				//pl(tmp);
				right++;
			}
		}
		if(utan<0) {
			tmp3-=utan;
		}


		right=0;
		for(int left=0; left<Math.max(N-K-1,0); left++) {
			if(right<Math.max(0, N-K-1) && rev[right]<0) {
				tmp3-=rev[right];
				right++;
			}
		}
		if(satan<0) {
			tmp4-=satan;
		}

		pl(Math.max(Math.max(tmp,tmp2),Math.max(tmp3,tmp4)));
		//pl(tmp+" "+tmp2);
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
}