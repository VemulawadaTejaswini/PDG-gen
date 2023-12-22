import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main{
	    
		public static class FastReader {
	        private InputStream stream;
	        private byte[] buf = new byte[1024];
	        private int curChar;
	        private int numChars;
	        private SpaceCharFilter filter;
	        public FastReader(InputStream stream) {
	            this.stream = stream;
	        }
	        public int read() {
	            if (numChars==-1)
	                throw new InputMismatchException();
	            if (curChar >= numChars) {
	                curChar = 0;
	                try {
	                    numChars = stream.read(buf);
	                }
	                catch (IOException e) {
	                    throw new InputMismatchException();
	                }
	                if(numChars <= 0)
	                    return -1;
	            }
	            return buf[curChar++];
	        }
	        public String nextLine() {
	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	            String str = "";
	            try {
	                str = br.readLine();
	            }
	            catch (IOException e) {
	                e.printStackTrace();
	            }
	            return str;
	        }
	        public int nextInt() {
	            int c = read();
	            while(isSpaceChar(c))
	                c = read();
	            int sgn = 1;
	            if (c == '-') {
	                sgn = -1;
	                c = read();
	            }
	            int res = 0;
	            do {
	                if(c<'0'||c>'9')
	                    throw new InputMismatchException();
	                res *= 10;
	                res += c - '0';
	                c = read();
	            }
	            while (!isSpaceChar(c));
	            return res * sgn;
	        }
	        public long nextLong() {
	            int c = read();
	            while (isSpaceChar(c))
	                c = read();
	            int sgn = 1;
	            if (c == '-') {
	                sgn = -1;
	                c = read();
	            }
	            long res = 0;
	            do {
	                if (c < '0' || c > '9')
	                    throw new InputMismatchException();
	                res *= 10;
	                res += c - '0';
	                c = read();
	            }
	            while (!isSpaceChar(c));
	            return res * sgn;
	        }
	        public double nextDouble() {
	            int c = read();
	            while (isSpaceChar(c))
	                c = read();
	            int sgn = 1;
	            if (c == '-') {
	                sgn = -1;
	                c = read();
	            }
	            double res = 0;
	            while (!isSpaceChar(c) && c != '.') {
	                if (c == 'e' || c == 'E')
	                    return res * Math.pow(10, nextInt());
	                if (c < '0' || c > '9')
	                    throw new InputMismatchException();
	                res *= 10;
	                res += c - '0';
	                c = read();
	            }
	            if (c == '.') {
	                c = read();
	                double m = 1;
	                while (!isSpaceChar(c))
	                {
	                    if (c == 'e' || c == 'E')
	                        return res * Math.pow(10, nextInt());
	                    if (c < '0' || c > '9')
	                        throw new InputMismatchException();
	                    m /= 10;
	                    res += (c - '0') * m;
	                    c = read();
	                }
	            }
	            return res * sgn;
	        }
	        public char nextChar() {
	            int c = read();
	            while (isSpaceChar(c))
	                c = read();
	            return (char)c;
	        }
	        public String next() {
	            int c = read();
	            while (isSpaceChar(c))
	                c = read();
	            StringBuilder res = new StringBuilder();
	            do {
	                res.appendCodePoint(c);
	                c = read();
	            }
	            while (!isSpaceChar(c));
	            return res.toString();
	        }
	        public boolean isSpaceChar(int c) {
	            if (filter != null)
	                return filter.isSpaceChar(c);
	            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	        }
	        public interface SpaceCharFilter {
	            public boolean isSpaceChar(int ch);
	        }
	      
	    }
		
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader sc = new FastReader(inputStream);
        PrintWriter w = new PrintWriter(outputStream);
        	int n = sc.nextInt();
        	double arr[] = new double[n];
        	for(int i =0;i<n;i++)
        		arr[i] = sc.nextDouble();
        	int ans = 0;
        	for(int i =0;i<n;i++) {
        		for(int j =i+1;j<n;j++) {
        			double temp = (arr[i]*arr[j]);
        			if(temp%1==0)
        				ans++;
        		}
        	}
        	w.println(ans);
        
        w.close();
	

}


	
	/*static int f(int p, int q, int r) {
	    int ans=0;
	     for(int i=0;i<=p;i++) {
	         int temp = 0;
	           for(int j=1;j<=q;j++) {
	                  int ta = (int)Math.pow(r,i);              // where pow() is the power function 
	                  int tb = (ta-1)/ta;
	                  temp += (int)Math.pow(tb,j);
	              }
	           int temp2 = fact(p)/(fact(p-i)*fact(i)); // where fact() is the factorial function
	           if(i%2==1) ans-=temp*temp2;
	           else ans+=temp*temp2;
	         }
	     return ans;
	}
	static int fact(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * fact(n-1));    
		 }    
	static class Pair{
	    	int first;
	    	int second;
	    	int dist;
	    	Pair(int first, int second,int dist){
	    		this.first = first;
	    		this.second = second;
	    		this.dist = dist;
	    	}
	    }
	 */
}
