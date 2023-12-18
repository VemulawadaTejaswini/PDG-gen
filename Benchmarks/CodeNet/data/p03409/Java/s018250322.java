import static java.lang.System.*;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] $) {
		SC sc = new SC(in);
		int n = sc.nextInt();
		int inf=Integer.MAX_VALUE;
		Point[] red=new Point[n];
		for (int i=0;i<n;i++)red[i]=new Point(sc.nextInt(),sc.nextInt());
		Point[] blue=new Point[n];
		for (int i=0;i<n;i++)blue[i]=new Point(sc.nextInt(),sc.nextInt());
		Arrays.sort(blue,(p1,p2)->p1.x-p2.x);
		int ans=0;
		for (int i = 0; i < n; i++) {
			Point b=blue[i];
			int red_y=-1;
			int red_index=-1;
			for (int j = 0; j < n; j++) {
				Point r=red[j];
				if(d(b,r)){
					if(red_y<r.y){
						red_y=r.y;
						red_index=j;
					}
				}
			}
			if(red_index>-1){
				ans++;
				red[red_index]=new Point(inf,inf);
			}
		}
		pl(ans);
	}
	static boolean d(Point blue,Point red){
		return red.x<blue.x&&red.y<blue.y;
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
