import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class Main {
	
	public static class Score implements Comparable<Score> {
		long point;
		int dir, pos;
		
		public Score(long point, int dir, int pos){
			this.point = point;
			this.dir = dir;
			this.pos = pos;
		}

		@Override
		public int compareTo(Score o) {
			return Long.compare(this.point, o.point);
		}
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int W = sc.nextInt();
		final int H = sc.nextInt();
		
		long[] ps = new long[W];
		long[] qs = new long[H];
		for(int i = 0; i < W; i++){
			ps[i] = sc.nextLong();
		}
		for(int i = 0; i < H; i++){
			qs[i] = sc.nextLong();
		}
		//System.out.println(Arrays.toString(ps) + " " + Arrays.toString(qs));
		PriorityQueue<Score> queue = new PriorityQueue<Score>();
		
		for(int i = 0; i < W; i++){
			queue.add(new Score(ps[i], 0, i));
		}
		for(int j = 0; j < H; j++){
			queue.add(new Score(qs[j], 1, j));
		}
		
		long answer = 0;
		int w_count = 0, h_count = 0;
		
		while(!queue.isEmpty()){
			final Score score = queue.poll();
			
			if(score.dir == 0){
				answer += score.point * ((H + 1) - h_count);
				w_count++;
			}else{
				answer += score.point * ((W + 1) - w_count);
				h_count++;
			}
			
			//System.out.println(score.point + " " + score.dir + " " + answer);
		}
		
		System.out.println(answer);
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
 
		public void close() throws IOException {
			br.close();
		}
	}
}