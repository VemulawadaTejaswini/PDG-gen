import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;
class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		long[] youso=new long[N];
		long[][] dp=new long[N+1][N+1];
		dp[0][0]=1;
		for (int i = 1; i <N; ++i) {
			dp[i][0] = 1;
			for (int j = 1; j <N; ++j) {
				dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
			}
		}
		for(int i=0; i<N; i++) {
			youso[i]=sc.nextLong();
		}
		Arrays.sort(youso);
		long sum=0;
		int maxLen=A;
		boolean all=true;
		for(int i=0; i<maxLen; i++) {
			sum+=youso[N-1-i];
			if(youso[N-1]!=youso[N-1-i]) {
				all=false;
			}
		}
		double avg=1.0*sum/A;
		pl(avg);
		long last=youso[N-maxLen];
		int numAll=0;
		int numselect=0;
		for(int i=0; i<N; i++) {
			if(youso[N-i-1]==last) {
				numAll++;
			}
			if(youso[N-1-i]==last && i<=A) {
				numselect++;
			}
		}
		if(!all) {
			pl(dp[numAll][numselect]);
		}
		else {
			long ans=0;
			for(int i=A; i<=B; i++) {
				if(youso[N-i]!=last) {
					break;
				}
				ans+=dp[numAll][i];
			}
			pl(ans);
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
/*
class D57{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		long[] youso=new long[N];
		long[][] dp=new long[N+1][N+1];
		dp[0][0]=1;
		for (int i = 1; i <N; ++i) {
			dp[i][0] = 1;
			for (int j = 1; j <N; ++j) {
				dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
			}
		}
		for(int i=0; i<N; i++) {
			youso[i]=sc.nextLong();
		}
		Arrays.sort(youso);
		long sum=0;
		int maxLen=A;
		boolean all=true;
		for(int i=0; i<maxLen; i++) {
			sum+=youso[N-1-i];
			if(youso[N-1]!=youso[N-1-i]) {
				all=false;
			}
		}
		double avg=1.0*sum/A;
		pl(avg);
		long last=youso[N-maxLen];
		int numAll=0;
		int numselect=0;
		for(int i=0; i<N; i++) {
			if(youso[N-i-1]==last) {
				numAll++;
			}
			if(youso[N-1-i]==last && i<=A) {
				numselect++;
			}
		}
		if(!all) {
			pl(dp[numAll][numselect]);
		}
		else {
			long ans=0;
			for(int i=A; i<=B; i++) {
				if(youso[N-i]!=last) {
					break;
				}
				ans+=dp[numAll][i];
			}
			pl(ans);
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

*/