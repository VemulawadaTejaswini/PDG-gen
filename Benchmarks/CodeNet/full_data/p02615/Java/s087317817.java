import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    public static void process()throws IOException
    {
        int n = ni(), arr[] = new int[n+1];

        for(int i = 1; i <= n; i++) arr[i] = ni();
        r_sort(arr);

        long res = 0l;

        for(int i = n-1; i >= 1; i--) res += arr[i+1]*1l;
        pn(res);
    }
 
    static final long mod=(long)1e9+7l;


    static void r_sort(int arr[]){
        int n=arr.length;
        Integer temp[]=new Integer[n];

        for(int i=0;i<n;i++) temp[i]=arr[i];
        Arrays.sort(temp);

        for(int i=0;i<n;i++) arr[i]=temp[i];
    }

    static FastReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc=new FastReader();
 
        long s = System.currentTimeMillis();
        int t=1;
       // t=ni();
        while(t-->0)
            process();
 
        out.flush();
        System.err.println(System.currentTimeMillis()-s+"ms");
    }
    
    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static int ni()throws IOException{return Integer.parseInt(sc.next());}
    static long nl()throws IOException{return Long.parseLong(sc.next());}
    static double nd()throws IOException{return Double.parseDouble(sc.next());}
    static String nln()throws IOException{return sc.nextLine();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
    
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 
    } 
}