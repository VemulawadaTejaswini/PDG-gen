import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] adj = new int[n][n];
		for(int i = 0; i < m; i++){
		    int a = sc.nextInt()-1;
		    int b = sc.nextInt()-1;
		    adj[a][b] = 1;
		    adj[b][a] = 1;
		}
		
		// 計算
		int result = 0;
		Permutation p = new Permutation(n-1);
		for(String s : p.list){
		    int from = 0;
		    boolean flg = true;
		    for(int i = 0; i < s.length(); i++){
		        int to = s.charAt(i)-'0';
		        if(adj[from][to] != 1){
		            flg = false;
		            break;
		        }
		        from = to;
		    }
		    if(flg) result++;
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

class Permutation {
	int n;
	String s;
	ArrayList<String> list;
	long cnt = 0;
	
	public Permutation(String s){
		this.n = s.length();
		this.s = s;
		
		boolean[] used = new boolean[n];
		ArrayList<String> list = new ArrayList<String>();
		dfs("", used, list);
		this.list = list;
	}
	
	public Permutation(int n){
		this.n = n;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			sb.append(i+1);
		}
		this.s = sb.toString();
		
		boolean[] used = new boolean[n];
		ArrayList<String> list = new ArrayList<String>();
		dfs("", used, list);
		this.list = list;
	}
	
	private void dfs(String s, boolean[] used, ArrayList<String> list){
		this.cnt++;
		if(s.length() == used.length){
			list.add(s);
			return;
		}
		for(int i = 0; i < used.length; i++){
			if(used[i]) continue;
			used[i] = true;
			dfs(s + this.s.charAt(i), used, list);
			used[i] = false;
		}
	}
}
