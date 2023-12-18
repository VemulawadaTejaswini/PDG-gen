import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long h = sc.nextLong();
		long w = sc.nextLong();
		int n = sc.nextInt();
		
		// 計算
		long[] result = new long[10];
		result[0] = (long)(h-2)*(w-2);
		HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt()-1;
		    int b = sc.nextInt()-1;
		    int[] dx = {-1, 0, 1, -1, 0, 1, -1, 0, 1}; // 9
		    int[] dy = {-1, -1, -1, 0, 0, 0, 1, 1, 1}; // 9
		    for(int k = 0; k < dx.length; k++){
		        int ni = a + dx[k];
		        int nj = b + dy[k];
		        if(0 <= ni && ni < h && 0 <= nj && nj < w){
		            if(0 < ni && ni < h-1 && 0 < nj && nj < w-1){
		                long key = (long)ni*w + nj;
		                hm.put(key, hm.getOrDefault(key, 0)+1);
		            }
		        }
		    }
		}
		for(Integer val : hm.values()){
		    result[val]++;
		    result[0]--;
		}
		// 出力
		for(long res : result){
		    System.out.println(res);
		}
		//System.out.println(result);
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
