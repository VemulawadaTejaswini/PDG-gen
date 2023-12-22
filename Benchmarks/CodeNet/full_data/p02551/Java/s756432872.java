import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int q = sc.nextInt();
		int I = n;
		int J = n;
		long black = (long)(n-2)*(n-2);
		BIT IBit = new BIT(n, 2);
		IBit.add(0, n-1, n-2);
		BIT JBit = new BIT(n, 2);
		JBit.add(0, n-1, n-2);
		for(int i = 0; i < q; i++){
		    int a = sc.nextInt();
		    int index = sc.nextInt()-1;
		    if(a == 1){
		        long cntI = IBit.get(index);
		        black -= cntI;
		        long cntJ = JBit.get((int)cntI);
		        if(index-1 < cntJ){
		            JBit.add(0, (int)cntI, (index-1) - cntJ);
		        }
		    }else{
		        long cntJ = JBit.get(index);
		        black -= cntJ;
		        long cntI = IBit.get((int)cntJ);
		        if(index-1 < cntI){
		            IBit.add(0, (int)cntJ, (index-1) - cntI);
		        }
		    }
		}
		
		// 計算
		long result = black;
		
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

class BIT {
	int n;
	long[] array;
	int mode = 1;
	
	public BIT(int n){
		this.n = n;
		this.array = new long[n+1];
	}
	
	public BIT(int n, int mode){
		this.n = n;
		this.array = new long[n+1];
		this.mode = mode;
	}
	
	public BIT(int[] a){
		this.n = a.length;
		this.array = new long[n+1];
		init(a);
	}
	public BIT(long[] a){
		this.n = a.length;
		this.array = new long[n+1];
		init(a);
	}
	
	public BIT(int[] a, int mode){
		this.n = a.length;
		this.array = new long[n+1];
		this.mode = mode;
		init(a);
	}
	public BIT(long[] a, int mode){
		this.n = a.length;
		this.array = new long[n+1];
		this.mode = mode;
		init(a);
	}
	
	public void init(int[] a){
		for(int i = 0; i < n; i++){
			add(i, a[i]);
		}
	}
	public void init(long[] a){
		for(int i = 0; i < n; i++){
			add(i, a[i]);
		}
	}

	public void add(int i, long a){
		switch(mode){
			case 1:
				for(i++; i < array.length; i += i&-i){
					array[i] += a;
				}
				break;
				
			case 2:
				add(i, i, a);
				break;
				
			default:
		}
	}
	
	public void add(int from, int to, long a){ // mode 2 only
		switch(mode){
			case 1:
				break;
				
			case 2:
				int i = from;
				for(i++; i < array.length; i += i&-i){
					array[i] += a;
				}
				i = to + 1;
				for(i++; i < array.length; i += i&-i){
					array[i] -= a;
				}
				break;
				
			default:
		}
	}
	
	public long get(int i){
		switch(mode){
			case 1:
				return getSum(i, i);
			case 2:
				return getSum(i);
			default:
				return getSum(i, i);
		}
	}
	
	public long getSum(int i){
		long r = 0;
		for(i++; i > 0; i -= i&-i){
			r += array[i];
		}
		return r;
	}
	
	public long getSum(int from, int to){ // mode 1 only
		return getSum(to) - getSum(from - 1);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < n; i++){
			sb.append(get(i));
			if(i != n-1) sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
}
