import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		
		// 計算
		long result = 0;
		ArrayList<NumList> list = new ArrayList<NumList>();
		for(long m = 2; m <= sqrt(n); m++){
		    if(n == 1) break;
		    if(n%m == 0){
		        NumList numList = new NumList(m, 0);
		        while(n%m == 0){
		            n = n/m;
		            numList.num2++;
		        }
		        list.add(numList);
		    }
		}
		if(n != 1) list.add(new NumList(n, 1));
    	for(NumList N : list){
    	    long a = N.num2;
    	    long temp = 0;
    	    for(int i = 1; i <= a; i++){
    	        temp += i;
    	        if(temp <= a) result++;
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

class NumList {
	long num1;
	long num2;
	
	NumList(long num1, long num2){
		this.num1 = num1;
		this.num2 = num2;
	}
}

