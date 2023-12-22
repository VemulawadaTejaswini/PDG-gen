import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
/*
 
 
 
 */

public class Main {

    public static void main(String args[] ) throws Exception {
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int t=1;
        //t = sc.ni();
        while(t-->0) {
        	solve(pw,sc);
        }
       
        pw.close();
    }
    static final int ma = (int)1e6+1; 
   
    private static void solve(PrintWriter pw, FastScanner sc) {
    	int[] l = new int[ma];
    	fill(l);
//    	for(int i=2;i<20;i++)
//    		pw.print(l[i]+" ");
    	int n = sc.ni();
    	long count=1;
    	for(int i=2;i<n;i++) {
    		HashMap<Integer,Integer> mp = new HashMap<>();
    		int te = i;
    		while(te>1) {
    			mp.put(l[te],mp.getOrDefault(l[te],0)+1);
    			te=te/l[te];
    		}
    		long tem=1;
    		for(Map.Entry<Integer, Integer> e : mp.entrySet()) {
    			tem=tem*(e.getValue()+1);
    		}
    		count+=tem;
    		
    	}
    	pw.print(count);
	}
    
    static void fill(int[] l) {
    	int t=0;
    	int[] pr = new int[ma];
    	for(int i=2;i<ma;i++) {
    		if(l[i]==0) {
    			l[i]=i;
    			pr[t++]=i;
    		}
    		for(int j=0;j<t&&pr[j]<=l[i]&&i*pr[j]<ma;++j) {
    			l[i*pr[j]]=pr[j];
    		}
    	}
    }

	static <T> void deb(T x,int o){
       System.out.print(x);
       if(o==0) {
    	   System.out.println();
    	   
       }
    }
   
   
   static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String ne() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		public String ne(int k) {
			try {
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "Not able to read";
		}
		
		int ni() {
			return Integer.parseInt(ne());
		}
		
		long nl() {
			return Long.parseLong(ne());
		}
		
		double nd() {
			return Double.parseDouble(ne());
		}
		
	    
	}
   
}