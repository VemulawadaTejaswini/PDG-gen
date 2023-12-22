import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int m = sc.nextInt();
		int[] sumH = new int[h];
		int[] sumW = new int[w];
		int[][] grid = new int[h][w];
		int maxH = 0;
		int maxW = 0;
		for(int i = 0; i < m; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			sumH[a]++;
			sumW[b]++;
			grid[a][b] = 1;
			maxH = max(maxH, sumH[a]);
			maxW = max(maxW, sumW[b]);
		}
		//System.out.println(Arrays.toString(sumH));
		//System.out.println(Arrays.toString(sumW));
		//System.out.println(maxH);
		//System.out.println(maxW);
		
		// 計算
		long result = 0;
		ArrayList<Integer> listH = new ArrayList<Integer>();
		ArrayList<Integer> listW = new ArrayList<Integer>();
		for(int i = 0; i < h; i++){
		    if(sumH[i] == maxH) listH.add(i);
		}
		for(int i = 0; i < w; i++){
		    if(sumW[i] == maxW) listW.add(i);
		}
		
		for(int i = 0; i < listH.size(); i++){
		    for(int j = 0; j < listW.size(); j++){
		        int indexH = listH.get(i);
		        int indexW = listW.get(j);
		        result = max(result, maxH + maxW - grid[indexH][indexW]);
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
