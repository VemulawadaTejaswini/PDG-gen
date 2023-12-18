import java.util.*;import java.io.*;import java.math.*;
public class Main
{
    public static void process()throws IOException
    {
        int n=ni();
        int k=ni();
        int[]A=nai(n);
        Arrays.sort(A);
        int[]B=new int[n+1];
        for(int i=1;i<=n;i++)
            B[i]=A[i-1];
        if(k==0)
            pn("0");
        else if(k==n)
            pn(A[n-1]-A[0]);
        else
        {   
            long ans=0;
            long[] fac = new long[n+1]; 
                fac[0] = 1; 
            for (int i = 1 ;i <= fac.length-1; i++) 
                fac[i] = fac[i-1] * i % mod; 
            for(int i=1;i<=n;i++)
            {
                if(n-i>=k-1)
                {
                    long temp=nCr(fac,(n-i),(k-1),mod)%mod;
                    temp=(temp*B[i])%mod;
                    ans-=temp;
                    ans=(ans+mod)%mod;
                }
                if(i-1>=k-1)
                {
                    long temp=nCr(fac,(i-1),(k-1),mod)%mod;
                    temp=(temp*B[i])%mod;
                    ans=(ans+temp)%mod;
                }
            }
            pn(ans);
            
        }
    }

    static AnotherReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        boolean oj =true;
        if(oj){sc=new AnotherReader();out=new PrintWriter(System.out);}
        else{sc=new AnotherReader(100);out=new PrintWriter("output.txt");}
        int t=1;
        // t=ni();
        while(t-->0) {process();}
        out.flush();out.close();  
    }
    static long power(long x, long y, long p) 
    { 
        long res = 1; 
        x = x % p;           
        while (y > 0) 
        { 
            if (y % 2 == 1) 
                res = (res * x) % p; 
            y = y >> 1;
            x = (x * x) % p; 
        } 
        return res; 
    } 
    static long modInverse(long n, long p) 
    { 
        return power(n, p-2, p); 
    } 
    static long nCr(long[]fac,int n,int r,long p)
    {
        return (fac[n]* modInverse(fac[r], p) % p * modInverse(fac[n-r], p) % p) % p; 
    }
    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static void pni(Object o){out.println(o);out.flush();}
    static int ni()throws IOException{return sc.nextInt();}
    static long nl()throws IOException{return sc.nextLong();}
    static double nd()throws IOException{return sc.nextDouble();}
    static String nln()throws IOException{return sc.nextLine();}
    static int[] nai(int N)throws IOException{int[]A=new int[N];for(int i=0;i!=N;i++){A[i]=ni();}return A;}
    static long[] nal(int N)throws IOException{long[]A=new long[N];for(int i=0;i!=N;i++){A[i]=nl();}return A;}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
    static long mod=(long)1e9+7;
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    static class AnotherReader{BufferedReader br; StringTokenizer st;
    AnotherReader()throws FileNotFoundException{
    br=new BufferedReader(new InputStreamReader(System.in));}
    AnotherReader(int a)throws FileNotFoundException{
    br = new BufferedReader(new FileReader("input.txt"));}
    String next()throws IOException{
    while (st == null || !st.hasMoreElements()) {try{
    st = new StringTokenizer(br.readLine());}
    catch (IOException  e){ e.printStackTrace(); }}
    return st.nextToken(); } int nextInt() throws IOException{
    return Integer.parseInt(next());}
    long nextLong() throws IOException
    {return Long.parseLong(next());}
    double nextDouble()throws IOException { return Double.parseDouble(next()); }
    String nextLine() throws IOException{ String str = ""; try{
    str = br.readLine();} catch (IOException e){
    e.printStackTrace();} return str;}}
   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
}