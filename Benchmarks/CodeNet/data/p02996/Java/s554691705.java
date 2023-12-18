import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;

import objs.pair;


public class  Main{
    public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        //MScanner sc = new MScanner("reduce.in");
        PrintWriter pw=new PrintWriter(System.out);
        //int n=sc.nextInt();
        //Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=sc.nextInt();
        int n=sc.nextInt();
        pair[]in=new pair[n];
        for(int i=0;i<n;i++) {
        	in[i]=new pair(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(in);
        int time=0;
        for(int i=0;i<n;i++) {
        	time+=in[i].t;
        	if(time>in[i].d) {
        		pw.println("No");pw.flush();return;
        	}
        }
        pw.println("Yes");
        pw.flush();
    }
    static class pair implements Comparable<pair>{
    	int t;int d;
    	pair(int x,int y){
    		t=x;d=y;
    	}
    	@Override
    	public int compareTo(pair o) {
    		if(d!=o.d) {
    			return d-o.d;
    		}
    		return t-o.t;
    	}
    	 
    	public boolean equals(pair o) {
    		if(this.compareTo(o)==0)return true;
    		return false;
    	}
    	public String toString() {
    		return "("+t+" "+d+")";
    	}
    }
    static StringBuilder tosb(int[]in) {
    	StringBuilder s=new StringBuilder();
    	for(int i=0;i<in.length;i++) {
    		s.append(in[i]+" ");
    	}
    	return s;
    }
    static StringBuilder tosb(long[]in) {
    	StringBuilder s=new StringBuilder();
    	for(int i=0;i<in.length;i++) {
    		s.append(in[i]+" ");
    	}
    	return s;
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