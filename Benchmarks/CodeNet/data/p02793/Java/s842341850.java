import java.util.*;import java.io.*;import java.math.*;
public class Main
{
    public static void process()throws IOException
    {
        int[]factor=new int[1000001];
        int n=ni();
        int[]A=nai(n);
        for(int j=0;j<n;j++)
        {
            int temp=A[j];
            int fac2=0;
            while(temp%2==0)
            {
                temp/=2;
                fac2++;
            }  
            factor[2]=Math.max(factor[2],fac2);
            for(int i=3;i<=Math.sqrt(temp);i+=2)
            {
                int faci=0;
                while(temp%i!=0)
                {
                    faci++;
                    temp/=i;
                }
                factor[i]=Math.max(factor[i],faci);
            }
            if(temp>2)
                factor[temp]=Math.max(factor[temp],1);
        }
        long lcm=1;
        for(int i=2;i<factor.length;i++)
            if(factor[i]!=0)
                lcm=(lcm*power(i,factor[i],mod))%mod;
        long ans=0;
        for(int i=0;i<n;i++)
            ans=(ans+(lcm*modInverse(A[i],mod)%mod))%mod;
        pn(ans);
    }

    static long modInverse(long a, long m) 
    { 
        return power(a, m - 2, m);
    } 
    static long power(long x, long y, long m)  
    {
        if (y == 0) 
            return 1; 
        long p = power(x, y / 2, m) % m; 
        p = (p * p) % m; 
        if (y % 2 == 0) 
            return p; 
        else
            return (x * p) % m; 
    } 

    static AnotherReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        boolean oj = true;
        if(oj){sc=new AnotherReader();out=new PrintWriter(System.out);}
        else{sc=new AnotherReader(100);out=new PrintWriter("output.txt");}
        int t=1;
        // t=ni();
        while(t-->0) {process();}
        out.flush();out.close();  
    }
    static long mod=(long)1e9+7;
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