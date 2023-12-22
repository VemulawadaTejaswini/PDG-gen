import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class Main {
    
    
    public static void main(String args[] ) throws Exception {
        StringBuffer str = new StringBuffer();
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextLong();
        }
        //Arrays.sort(a);
        int ans=0;
        //int[][][] vis = new int[101][101][101];
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int pa=0;
                    if(a[i]==a[j]||a[i]==a[k]||a[k]==a[j])
                        continue;
                    if(a[i]+a[j]>a[k]){
                        pa++;
                    }
                    if(a[k]+a[j]>a[i]){
                        pa++;
                    }
                    if(a[i]+a[k]>a[j]){
                        pa++;
                    }
                    if(pa==3){
                        ans++;
                    }
                    //System.out.println(a[i]+" "+a[j]+" "+a[k]);
                }
            }
        }
        str.append(ans);
        
        
        
        
        
        pw.println(str.toString());
        
        pw.close();
    }
     
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		public String next(int k) {
			try {
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "Not able to read";
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
	    
	}
   
}