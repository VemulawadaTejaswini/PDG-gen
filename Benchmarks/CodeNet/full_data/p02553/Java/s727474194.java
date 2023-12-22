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
    
    private static void solve(PrintWriter pw, FastScanner sc) {
    	long a=sc.ni(),b = sc.ni(),c = sc.ni(),d = sc.ni();
    	long ans=0;
    	if(a>=0&&b>=0&&c>=0&&d>=0)
    		ans = b*d;
    	else if(a<0&&b>=0&&c>=0&&d>=0)
    		ans = b*d;
    	else if(a>=0&&b>=0&&c<0&&d>=0)
    		ans = b*d;
    	
    	else if(a<0&&b<0&&c<0&&d<0)
    		ans = a*c;
    	else if(a<0&&b<0&&c<0&&d>=0)
    		ans = a*c;
    	else if(a<0&&b>=0&&c<0&&d<0)
    		ans = a*c;
    	
    	else if(a>=0&&b>=0&&c<0&&d<0)
    		ans = a*d;
    	else if(a>=0&&b>=0&&c<0&&d>=0)
    		ans = b*d;
    	else if(a<0&&b>=0&&c<0&&d<0)
    		ans = a*c;
    	
    	else if(a<0&&b<0&&c>=0&&d>=0)
    		ans = b*c;
    	else if(a<0&&b<0&&c<0&&d>=0)
    		ans = a*c;
    	else if(a<0&&b>=0&&c>=0&&d>=0)
    		ans = b*d;
    	else if(a<0&&b>=0&&c<0&&d>=0)
    		ans = Math.max(a*c, b*d);
    	
    	pw.print(ans);
    	
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