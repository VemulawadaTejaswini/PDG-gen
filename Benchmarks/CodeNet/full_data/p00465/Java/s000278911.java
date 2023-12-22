import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static final long INF = Long.MAX_VALUE / 4 - 1;
	
	public static final int[][] move_dir = new int[][]{
		{1, 0}, {-1, 0}, {0, 1}, {0, -1}
	};
	
	public static class Auth implements Comparable<Auth>{
		int x, y;
		long level;

		public Auth(int x, int y, long level) {
			super();
			this.x = x;
			this.y = y;
			this.level = level;
		}

		@Override
		public int compareTo(Auth arg0) {
			return this.level < arg0.level ? -1 : this.level > arg0.level ? 1 : 0;
		}
	}
	
	public static boolean is_ok(int H, int W, int y, int x){
		if(x < 0 || x >= W || y < 0 || y >= H){ return false; }
		return true;
	}
	
	public static long[] process(Scanner sc, final int R) throws IOException{
		final int W = sc.nextInt();
		final int H = sc.nextInt();
		final int X = sc.nextInt() - 1;
		final int Y = sc.nextInt() - 1;
		
		long[][] map = new long[H][W];
		
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				final int level = sc.nextInt();
				
				map[i][j] = level;
			}
		}
		
		TreeMap<Long, Integer> counts = new TreeMap<Long, Integer>();
		boolean[][] already = new boolean[H][W];
		
		PriorityQueue<Auth> queue = new PriorityQueue<Auth>();
		queue.add(new Auth(X, Y, 1));
		counts.put(0l, 0);
		
		while(!queue.isEmpty()){
			Auth auth = queue.poll();
			
			if(already[auth.y][auth.x]){
				continue;
			}else{
				already[auth.y][auth.x] = true;
				if(!counts.containsKey(auth.level)){
					counts.put(auth.level, 0);
				}
				counts.put(auth.level, counts.get(auth.level) + 1);
			}
			
			for(int[] move : move_dir){
				final int nx = auth.x + move[0];
				final int ny = auth.y + move[1];
				
				if(!is_ok(H, W, ny, nx)){
					continue;
				}else if(already[ny][nx]){
					continue;
				}
				
				queue.add(new Auth(nx, ny, Math.max(auth.level, map[ny][nx])));
			}
		}
		
		long[] ret = new long[R + 1];
		Arrays.fill(ret, INF);
		ret[0] = 0l;
		int cnt = 1;
		for(Entry<Long, Integer> entry : counts.entrySet()){
			final int next_cnt = Math.min(cnt + entry.getValue(), R + 1);
			
			for(int i = cnt; i < next_cnt; i++){
				ret[i] = entry.getKey();
			}
			cnt = next_cnt;
		}
		//System.out.println(Arrays.toString(ret));
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int R = sc.nextInt();
			if(R == 0){
				break;
			}
			
			long[] one = process(sc, R);
			long[] two = process(sc, R);
			
			long min = INF;
			for(int i = 0; i <= R; i++){
				min = Math.min(min, one[i] + two[R - i]);
			}
			System.out.println(min);
			
			System.gc();
		}
		
		sc.close();
	}
	
	public static class Scanner {
	    private BufferedReader br;
	    private StringTokenizer tok;

	    public Scanner(InputStream is) throws IOException {
	        br = new BufferedReader(new InputStreamReader(is));
	    }

	    private void getLine() throws IOException {
	        while (!hasNext()) { tok = new StringTokenizer(br.readLine()); }
	    }

	    private boolean hasNext() {
	        return tok != null && tok.hasMoreTokens();
	    }

	    public String next() throws IOException {
	        getLine(); return tok.nextToken();
	    }

	    public int nextInt() throws IOException {
	        return Integer.parseInt(next());
	    }
	    
	    public void close() throws IOException {
	        br.close();
	    }
	}

}