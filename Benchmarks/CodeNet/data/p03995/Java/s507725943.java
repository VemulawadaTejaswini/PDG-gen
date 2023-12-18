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
	
	public static boolean ok(final int[][] poses, ArrayList<HashMap<Integer, Long>> values, final int R, final int C){
		// 無効な部分なので計算しない
		for(final int[] pos : poses){
			if(pos[0] < 0 || pos[0] >= R){ return true; }
			if(pos[1] < 0 || pos[1] >= C){ return true; }
		}
		//System.out.println(Arrays.deepToString(poses));
		
		int count = 0;
		for(final int[] pos : poses){
			count += (values.get(pos[0]).containsKey(pos[1]) ? 0 : 1);
		}
		// 2 つ以上が不定なら OK
		if(count >= 2){ return true; }
		
		if(count == 1){
			long sum = 0;
			for(int i = 0; i < 4; i++){
				if(!values.get(poses[i][0]).containsKey(poses[i][1])){
					continue;
				}
				
				sum += (i == 1 || i == 2 ? -1 : 1) * values.get(poses[i][0]).get(poses[i][1]);
			}
			
			//System.out.println("part_filled : " + sum);
			
			return sum <= 0;
		}else{
			long sum = 0;
			for(int i = 0; i < 4; i++){
				sum += (i == 1 || i == 2 ? -1 : 1) * values.get(poses[i][0]).get(poses[i][1]);
			}
			
			//System.out.println("all_filled : " + sum);
			
			return sum == 0;
		}
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int R = sc.nextInt();
		final int C = sc.nextInt();
		final int N = sc.nextInt();
		
		ArrayList<HashMap<Integer, Long>> values = new ArrayList<HashMap<Integer, Long>>();
		for(int i = 0; i < R; i++){
			values.add(new HashMap<Integer, Long>());
		}
		
		int[] rs  = new int[N];
		int[] cs  = new int[N];
		long[] as = new long[N];
		
		for(int i = 0; i < N; i++){
			final int r = sc.nextInt() - 1;
			final int c = sc.nextInt() - 1;
			final long a = sc.nextLong();
			
			rs[i] = r;
			cs[i] = c;
			as[i] = a;
			values.get(r).put(c, a);
		}
		
		boolean flg = true;
		int[][] moves = new int[4][2];
		for(int i = 0; i < N; i++){
			final int r = rs[i];
			final int c = cs[i];
			
			for(int dy = 0; dy <= 1; dy++){
				for(int dx = 0; dx <= 1; dx++){
					
					for(int k = 0; k < 4; k++){
						moves[k][0] = r - dx + (k == 2 || k == 3 ? 1 : 0);
						moves[k][1] = c - dy + (k == 1 || k == 3 ? 1 : 0);
					}
					
					flg &= ok(moves, values, R, C);
				}
			}
		}
		
		flg &= ok(new int[][]{{0, 0}, {0, C - 1}, {R - 1, 0}, {R - 1, C - 1}}, values, R, C);
		System.out.println(flg ? "Yes" : "No");
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