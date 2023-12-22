import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		}
		
		// 計算
		long result = 1000;
		ArrayList<Long> buy = new ArrayList<Long>();
		ArrayList<Long> sell = new ArrayList<Long>();
		long b = 0;
		long pre = 0;
		for(int i = 0; i < n; i++){
		    if(i == 0){
		        b = a[i];
		        pre = a[i];
		    }else{
		        if(pre < a[i]){
		            pre = a[i];
		        }else if(b < pre){
		            buy.add(b);
		            sell.add(pre);
		            b = a[i];
		            pre = a[i];
		        }else{
		            b = a[i];
		            pre = a[i];
		        }
		    }
		}
		if(b < pre){
		    buy.add(b);
		    sell.add(pre);
		}
		//System.out.println(buy.toString());
		//System.out.println(sell.toString());
		
		for(int i = 0; i < buy.size(); i++){
		    long B = buy.get(i);
		    long S = sell.get(i);
		    result = result - (result/B)*B + (result/B)*S;
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
