import java.util.*;import java.io.*;import java.math.*;
public class Main
{
    public static void process()throws IOException
    {
        int h=ni();
        int w=ni();
        int m=ni();
        long[]H=new long[h+1];
        long[]W=new long[w+1];
        long max1=0,max2=0;
        TreeSet<Long>set=new TreeSet<>();
        for(int i=0;i<m;i++)
        {
            int x=ni();
            int y=ni();
            H[x]++;
            max1=Math.max(max1,H[x]);
            W[y]++;
            max2=Math.max(max2,W[y]);
            long temp=x*(long)(1e9)+y;
            set.add(temp);
        }
        ArrayList<Long>hor=new ArrayList<>();
        ArrayList<Long>ver=new ArrayList<>();
        for(int i=1;i<=h;i++)
            if(H[i]==max1)
                hor.add((long)i);
        for(int i=1;i<=w;i++)
            if(W[i]==max2)
                ver.add((long)i);
        for(Long x:hor)
            for(Long y:ver)
            {
                long temp=x*(long)1e9+y;
                if(!set.contains(temp))
                {pn(max1+max2);return;}
            }
        pn(max1+max2-1);
    }
    static long mod=(long)1e9+7l;
    static AnotherReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        boolean oj = true;
        if(oj){sc=new AnotherReader();out=new PrintWriter(System.out);}
        else{sc=new AnotherReader(100);out=new PrintWriter("output.txt");}
        int t=1;
        // t=ni();
        while(t-- > 0) {process();}
        out.flush();out.close();  
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