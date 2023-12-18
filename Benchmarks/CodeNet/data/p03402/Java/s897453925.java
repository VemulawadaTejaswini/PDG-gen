import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	static int[][] area;
	static int White,Black;
	static int zone;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		area=new int[100][100];
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				area[i][j]=0;
			}
		}
		if(A==B && A==1) {
			pl("1 2");
			pl(".#");
			System.exit(0);
		}
		pl("100 100");
		if(A>=B) {	//白のほうが多い
			White=A;
			Black=B;
			zone=1;
			Black--;
			White--;
			fill(zone);
			zone+=2;
			dot(zone);
			StringBuilder sb=new StringBuilder();
			for(int i=0; i<100; i++) {
				sb=new StringBuilder();
				for(int j=0; j<100; j++) {
					if(area[i][j]==0) {
						sb.append(".");
					}
					else {
						sb.append("#");
					}
				}
				pl(sb.toString());
			}
		}
		else if(A<B) {	//跡で反転させる
			int tmp=B;
			B=A;
			A=tmp;
			White=A;
			Black=B;
			zone=1;
			Black--;
			White--;
			fill(zone);
			zone+=2;
			dot(zone);
			StringBuilder sb=new StringBuilder();
			for(int i=0; i<100; i++) {
				sb=new StringBuilder();
				for(int j=0; j<100; j++) {
					if(area[i][j]==0) {
						sb.append("#");
					}
					else {
						sb.append(".");
					}
				}
				pl(sb.toString());
			}
		}
	}
	public static void fill(int i) {
		for(int j=0; j<100; j++) {
			area[i][j]=1;	//黒でぬる
		}
		White--;
		if(White<=49) {
			for(int j=1; j<=White; j++) {
				area[i-1][j*2-1]=1;
			}
			White=0;
		}
		else if(White>49) {
			for(int j=1; j<=97; j+=2) {
				area[i-1][j]=1;
			}
			White-=49;
			if(White>0) {
				zone+=2;
				fill(i+2);
			}
		}
	}
	public static void dot(int i) {

		if(Black<=50) {
			for(int j=0; j<Black; j++) {
				area[i][j*2]=1;
			}
			Black=0;
		}

		else if(Black>50) {
			for(int j=0; j<100; j+=2) {
				area[i][j]=1;
			}
			Black-=50;
			if(Black>0) {
				dot(i+2);
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
}