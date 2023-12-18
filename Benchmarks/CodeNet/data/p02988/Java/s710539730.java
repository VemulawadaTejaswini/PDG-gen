import java.util.*;import java.io.*;import java.math.*;

public class Main
{

    public static void process()throws IOException
    {
        int n=ni(),arr[]=new int[n+1],res=0;
        for(int i=1;i<=n;i++) arr[i]=ni();
        for(int i=2;i<n;i++){
            res+=((arr[i-1]<arr[i] && arr[i]<arr[i+1]) || ((arr[i-1]>arr[i] && arr[i]>arr[i+1])))?1:0;
            //pn(" i res "+i+" "+res);
        }
        pn(res);
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

    static<T> void r_sort(T arr[],int n){
        Random r = new Random(); 
        for (int i = n-1; i > 0; i--){ 
            int j = r.nextInt(i+1); 
                  
            T temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
        } 
        Arrays.sort(arr); 
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
    
    static long mcomb(long a, long b) {
        if(b > a - b)
            return mcomb(a, a - b);
        long m = 1;
        long d = 1;
        long i;
        for(i = 0; i < b; i++) {
            m *= (a - i);
            m %= mod;
            d *= (i + 1);
            d %= mod;
        }
        long ans = m * mpow(d, mod - 2) % mod;
        return ans;
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