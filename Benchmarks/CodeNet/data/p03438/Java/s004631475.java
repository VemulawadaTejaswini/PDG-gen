import java.text.DecimalFormat;
import java.io.*;
import java.util.*;
import java.math.*;
public class Main{  
  
	static int mmp=1000000007;
	static InputReader in=new  InputReader(System.in);  
    static PrintWriter out= new PrintWriter(System.out);
    static int n=0;
    static long[] num=new long[10010];
    static long[] num1=new long[10010];
    static long total=0l,sum=0l,sum1=0l;
    public static void main(String[] args) throws IOException {
    	n=in.nextInt();
    	for(int i=1;i<=n;++i) {
    		num[i]=in.nextLong();
    		sum+=num[i];
    	}
    	for(int i=1;i<=n;++i) {
    		num1[i]=in.nextLong();
    		sum1+=num1[i];
    	}
    	for(int i=1;i<=n;++i) {
    		if(num[i]>num1[i])
    			total+=(num[i]-num1[i]);
    	}
    	if(total+sum<=sum1) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    	
    	
    }
   
    

    
    

    

    

    static class InputReader {  
        BufferedReader br;  
  
        public InputReader(InputStream stream) {  
            br = new BufferedReader(new InputStreamReader(stream));  
        }  
  
        public int nextInt() throws IOException {  
            int c = br.read();  
            while (c <= 32) {  
                c = br.read();  
            }  
            boolean negative = false;  
            if (c == '-') {  
                negative = true;  
                c = br.read();  
            }  
            int x = 0;  
            while (c > 32) {  
                x = x * 10 + c - '0';  
                c = br.read();  
            }  
            return negative ? -x : x;  
        }  
  
        public long nextLong() throws IOException {  
            int c = br.read();  
            while (c <= 32) {  
                c = br.read();  
            }  
            boolean negative = false;  
            if (c == '-') {  
                negative = true;  
                c = br.read();  
            }  
            long x = 0;  
            while (c > 32) {  
                x = x * 10 + c - '0';  
                c = br.read();  
            }  
            return negative ? -x : x;  
        }  
  
        public String next() throws IOException {  
            int c = br.read();  
            while (c <= 32) {  
                c = br.read();  
            }  
            StringBuilder sb = new StringBuilder();  
            while (c > 32) {  
                sb.append((char) c);  
                c = br.read();  
            }  
            return sb.toString();  
        }  
  
        public double nextDouble() throws IOException {  
            return Double.parseDouble(next());  
        }  
    }  
} 
