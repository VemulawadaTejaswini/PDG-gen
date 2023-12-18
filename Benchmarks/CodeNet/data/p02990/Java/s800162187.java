import java.util.*;import java.io.*;import java.math.*;

public class Main
{

    public static void process()throws IOException
    {
        int n=ni(),k=ni();
        StringBuilder res = new StringBuilder();
        COMinit();
        for(int i=1;i<=k;i++){
            //pick i places out of n+1 places
            long choices=COM(n-k+1,i);

            //place k balls in those i places

            long total=(choices*COM(k-1,i-1))%mod;

            res.append(total+"\n");
        }
        p(res);
    }


    static FastReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc=new FastReader();

        long s = System.currentTimeMillis();
        int t=1;
        //t=ni();
        while(t-->0)
            process();

        out.flush();
        System.err.println(System.currentTimeMillis()-s+"ms");
        System.out.close();  
    }
    
    
    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static void pni(Object o){out.println(o);System.out.flush();}
    static int ni()throws IOException{return Integer.parseInt(sc.next());}
    static long nl()throws IOException{return Long.parseLong(sc.next());}
    static double nd()throws IOException{return Double.parseDouble(sc.next());}
    static String nln()throws IOException{return sc.nextLine();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
    static boolean multipleTC=false;
    static long mod=(long)1e9+7l;

    static  int MAX = 510000;
    static  int MOD = 1000000007;
 
     static long[] fac = new long[MAX]; 
     static long[] finv = new long[MAX]; 
     static long[] inv = new long[MAX]; 
 
    
    static void COMinit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
 

    static long COM(int n, int k){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    static long mpow(long x, long n) {
        if(n == 0)
            return 1;
        if(n % 2 == 0) {
            long root = mpow(x, n / 2);
            return root * root % mod;
        }else {
            return x * mpow(x, n - 1) % mod;
        }
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try{ 
                str = br.readLine(); 
            } 
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
}