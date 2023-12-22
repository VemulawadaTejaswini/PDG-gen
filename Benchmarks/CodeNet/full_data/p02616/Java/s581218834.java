import java.io.*;
import java.util.*;

public class D implements Runnable {


    public void run() {
       	
        InputReader sc = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        long a[]=new long[n];
        long b[]=new long[n];
        sa(a,sc,k,b);
        //for(long i:b) out.print(i+" ");
        //out.println();
        long ans=1;
        long ans2=1;
        long mod=(long)1e9+7;
        
        for(int i=n-k;i<n;i++)
        {
            ans=(ans%mod)*(a[i]%mod);
            ans%=mod;
            
            ans2=(ans2%mod)*(b[i]%mod);
            ans2%=mod;
        }
        long tmp=Math.max(ans,ans2);
        if(tmp<0) tmp+=mod;
        out.println(tmp);
        out.close();
    }
 

//========================================================================

	static class Pair
	{
		int a,b;
		Pair(int aa,int bb)
		{
			a=aa;
			b=bb;
		}
	}
	
	static void sa(long a[],InputReader sc,int k,long b[])
	{
        int n=a.length;
		for(int i=0;i<a.length;i++)
		{
            a[i]=sc.nextInt();
            b[i]=a[i];
		}
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i+=2)
        {
            if(a[i]>=0) break;
            if(i+1<n && k-2>=0)
            {
                if(a[i+1]<0)
                {
                    a[i]*=-1;
                    a[i+1]*=-1;
                    k-=2;
                }
            }
        }
        Arrays.sort(a);
	}

	static class PairSort implements Comparator<Pair>
	{
		public int compare(Pair a,Pair b)
		{
			return b.b-a.b;
		}
	}


    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        public InputReader(InputStream stream) {
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
                while (!isSpaceChar(c)) {
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
       
        public String readString() {
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
     
        public String next() {
            return readString();
        }
       
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception {
        new Thread(null, new D(),"Main",1<<27).start();
    }
}
