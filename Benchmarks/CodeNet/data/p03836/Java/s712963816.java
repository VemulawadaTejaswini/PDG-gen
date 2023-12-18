import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void move(int sx, int sy, int tx, int ty, StringBuilder sb, boolean first){
		final int x_sign = Integer.signum(tx - sx);
		final int y_sign = Integer.signum(ty - sy);
		
		int cur_x = sx, cur_y = sy;
		if(!first){
			cur_x += (-x_sign);
			sb.append(x_sign > 0 ? "L" : "R");

			ty += (y_sign);
		}
		
		for(;cur_y != ty; cur_y += y_sign){
			sb.append(y_sign > 0 ? "U" : "D");
		}
		
		
		for(; cur_x != tx; cur_x += x_sign){
			sb.append(x_sign > 0 ? "R" : "L");
		}
		
		if(!first){
			sb.append(y_sign > 0 ? "D" : "U");
		}
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int sx = sc.nextInt();
		final int sy = sc.nextInt();
		final int tx = sc.nextInt();
		final int ty = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		move(sx, sy, tx, ty, sb, true);
		move(tx, ty, sx, sy, sb, true);
		move(sx, sy, tx, ty, sb, false);
		move(tx, ty, sx, sy, sb, false);
		
		System.out.println(sb);
		
	}
	
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		
		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}