import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Main{
	static Queue<Integer> Q;
	static int H,W;
	static int[] xv= {1,0,-1,0};
	static int[] yv= {0,1,0,-1};
	static int[][] ary;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		H=sc.nextInt();
		W=sc.nextInt();
		String[] s=new String[H];
		for(int i=0; i<H; i++) {
			s[i]=sc.next();
		}
		ary=new int[H][W];
		Q=new ArrayDeque<Integer>();
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(s[i].charAt(j)=='#') {
					ary[i][j]=0;
					Q.add(i*W+j);
				}
				else {
					ary[i][j]=114514;
				}
			}
		}
		while(!Q.isEmpty()) {
			int now=Q.poll();
			isvalid(now);
		}
		int max=0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				max=Math.max(max, ary[i][j]);
			}
		}
		/*for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				p(ary[i][j]+" ");
			}
			pl("");
		}*/
		pl(max);
	}
	public static void isvalid(int num) {
		int y=num/W;
		int x=num%W;
		for(int i=0; i<4; i++) {
			if(y+yv[i]>=0 && y+yv[i]<H) {
				if(x+xv[i]>=0 && x+xv[i]<W) {
					if(ary[y+yv[i]][x+xv[i]]>2000) {
						Q.add((y+yv[i])*W+(x+xv[i]));
						ary[y+yv[i]][x+xv[i]]=ary[y][x]+1;
					}
				}
			}
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
	public static void p(Object o) {
		System.out.print(o);
	}
}
