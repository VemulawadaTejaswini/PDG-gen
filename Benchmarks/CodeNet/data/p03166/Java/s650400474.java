import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    static int[] max;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		max = new int[n];
		list = new ArrayList[n];
		for(int i = 0; i < n; i++){
		    list[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++){
		    int from = sc.nextInt()-1;
		    int to = sc.nextInt()-1;
		    list[from].add(to);
		}
		//System.out.println(Arrays.deepToString(list));
		
		// 計算
		int result = 0;
		for(int i = 0; i < n; i++){
		    dfs(i);
		}
		for(int i = 0; i < n; i++){
		    result = max(result, max[i]);
		}
		
		// 出力
		System.out.println(result);
	}
	
	public static int dfs(int i){
	    if(max[i] != 0) return max[i];
	    int dist = 0;
	    for(Integer next : list[i]){
	        dist = max(dist, dfs(next)+1);
	    }
	    max[i] = dist;
	    return dist;
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
