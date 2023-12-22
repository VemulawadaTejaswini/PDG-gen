import java.util.*;
import java.io.*;
import java.math.BigInteger;
import static java.lang.Math.*;

public class Main {
    static int[] list;
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String x = sc.next();
		
		// 計算
		//int result = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++){
		    if(x.charAt(i) == '1') cnt++;
		}
		list = new int[n+1];
		Arrays.fill(list, -1);
		list[0] = 0;
		list[1] = 1;
		for(int i = n; i >= 0; i--){
		    f(i);
		}
		/*
		for(int i = 0; i < 24; i++){
		    System.out.println(list[i]);
		}*/
		for(int i = 0; i < n; i++){
		    int result = 0;
		    char[] c = x.toCharArray();
		    int count = cnt;
		    if(c[i] == '0'){
		        c[i] = '1';
		        count++;
		    }else{
		        c[i] = '0';
		        count--;
		    }
		    String s = new String(c);
		    BigInteger bi = new BigInteger(s, 2);
		    if(!BigInteger.ZERO.equals(bi)){
		        BigInteger bj = bi.mod(new BigInteger(Integer.toString(count)));
		        result = list[bj.intValue()] + 1;
		    }
		    System.out.println(result);
		}
		

		// 出力
		//System.out.println(result);
	}
	
	public static int f(int n) {
	    if(list[n] != -1) return list[n];
	    int m = Integer.bitCount(n);
	    list[n] = f(n%m)+1;
	    return list[n];
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

