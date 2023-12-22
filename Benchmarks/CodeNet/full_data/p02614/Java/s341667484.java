import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    grid[i] = s.toCharArray();
		}
		
		
		// 計算
		long result = 0;
		for(int ih = 0; ih < (1<<h); ih++){
			for(int iw = 0; iw < (1<<w); iw++){
			    int[][] g = new int[h][w];
		        for(int i = 0; i < h; i++){
		            for(int j = 0; j < w; j++){
		                if(grid[i][j] == '#') g[i][j] = 1;
		            }
		        }
			    for(int jh = 0; jh < h; jh++){
				    if(((ih>>jh)&1) == 1){
					    for(int i = 0; i < w; i++){
					        g[jh][i] = 0;
					    }
				    }
			    }
			    for(int jw = 0; jw < w; jw++){
				    if(((iw>>jw)&1) == 1){
					    for(int i = 0; i < h; i++){
					        g[i][jw] = 0;
					    }
				    }
			    }
			    int tmp = 0;
			    for(int i = 0; i < h; i++){
		            for(int j = 0; j < w; j++){
		                if(g[i][j] == 1) tmp++;
		            }
		        }
		        if(tmp == k) result++;
			}
		}
		
		
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

