import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;


public class  Main{
	public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        //MScanner sc = new MScanner("reduce.in");
        PrintWriter pw=new PrintWriter(System.out);
        int a=sc.nextInt();int b=sc.nextInt();
        if(a==b)pw.println(a+b);
        else {
        	pw.println(2*Math.max(a, b)-1);
        }
        pw.flush();
    }
    static class edge implements Comparable<edge>{
    	int node;int cost;
    	edge(int a,int b){
    		node=a;cost=b;
    	}
		@Override
		public int compareTo(edge o) {
			if(cost!=o.cost) {
				return cost-o.cost;
			}
				return node-o.node;
			
		}
		public String toString() {
			return "("+node+" "+cost+")";
		}
    }
    static class MScanner {
		StringTokenizer st;
		BufferedReader br;
 
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}