import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int ch = sc.nextInt()-1;
		int cw = sc.nextInt()-1;
		int dh = sc.nextInt()-1;
		int dw = sc.nextInt()-1;
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
			grid[i] = sc.next().toCharArray();
		}
		/*
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		*/
		
		// 計算
		long result = 0;
		int INF = 1001001001;
		int[] dist = new int[h*w];
		Arrays.fill(dist, INF);
		dist[ch*w+cw] = 0;
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.addFirst(ch*w+cw);
		int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1, -2, -2, -2, -2, -2, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}; 
		int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2, -2, -1, 0, 1, 2};
		while(!q.isEmpty()){
		    int index = q.pollFirst();
		    int now = dist[index];
    		int i = index/w;
    		int j = index%w;
    		for(int k = 0; k < dx.length; k++){
    		    int ni = i + dx[k];
    		    int nj = j + dy[k];
    		    int c = 1;
    		    if(abs(dx[k]) + abs(dy[k]) == 1) c = 0;
    		    if(0 <= ni && ni < h && 0 <= nj && nj < w){
    		        if(grid[ni][nj] == '.'){
    		            if(now + c < dist[ni*w+nj]){
    		                dist[ni*w+nj] = now + c;
    		                if(c == 0){
    		                    q.addFirst(ni*w+nj);
    		                }else{
    		                    q.addLast(ni*w+nj);
    		                }
    		            }
    		        }
    			}
    		}
		}
		
		if(dist[dh*w+dw] == INF){
		    result = -1;
		}else{
		    result = dist[dh*w+dw];
		}
		//System.out.println(Arrays.toString(dist));
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}
