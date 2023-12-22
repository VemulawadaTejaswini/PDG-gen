import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++){
		    l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		// 計算
		int result = 0;
		for(int i = 0; i < n; i++){
		    for(int j = i+1; j < n; j++){
		        for(int k = j+1; k < n; k++){
		            if(l[i] == l[j] || l[j] == l[k]) continue;
		            if(l[k] < l[i]+l[j]){
		                result++;
		                //System.out.println(l[i] + " " +l[j] + " " + l[k]);
		            }
		        }
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
