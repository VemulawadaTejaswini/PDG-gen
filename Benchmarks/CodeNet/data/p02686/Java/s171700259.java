import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++){
		    s[i] = sc.next();
		}
		
		// 計算
		String result = "Yes";
		ArrayList<int[]> up = new ArrayList<int[]>();
		ArrayList<int[]> down = new ArrayList<int[]>();
		int total = 0;
		for(int i = 0; i < n; i++){
		    int cnt = 0;
		    int minus = 0;
		    for(int j = 0; j < s[i].length(); j++){
		        if(s[i].charAt(j) == '(') cnt++;
		        if(s[i].charAt(j) == ')') cnt--;
		        minus = min(minus, cnt);
		    }
		    if(cnt >= 0){
		        up.add(new int[]{i, minus, cnt});
		    }else{
		        down.add(new int[]{i, minus-cnt, -cnt});
		    }
		    total += cnt;
		}
		if(total != 0) result = "No";
		Collections.sort(up, (x, y) -> Integer.compare(y[1], x[1]));
		Collections.sort(down, (x, y) -> Integer.compare(y[1], x[1]));
		int cnt = 0;
		for(int[] u : up){
		    if(cnt + u[1] < 0){
		        result = "No";
		        break;
		    }else{
		        cnt += u[2];
		    }
		}
		cnt = 0;
		for(int[] d : down){
		    if(cnt + d[1] < 0){
		        result = "No";
		        break;
		    }else{
		        cnt += d[2];
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

