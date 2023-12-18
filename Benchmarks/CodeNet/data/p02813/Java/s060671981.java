            
import java.util.*;import java.io.*;import java.math.*;

public class Main
{
    public static int[] swap(int data[], int left, int right) 
    { 
  
        // Swap the data 
        int temp = data[left]; 
        data[left] = data[right]; 
        data[right] = temp; 
  
        // Return the updated array 
        return data; 
    } 
  
    // Function to reverse the sub-array 
    // starting from left to the right 
    // both inclusive 
    public static int[] reverse(int data[], int left, int right) 
    { 
  
        // Reverse the sub-array 
        while (left < right) { 
            int temp = data[left]; 
            data[left++] = data[right]; 
            data[right--] = temp; 
        } 
  
        // Return the updated array 
        return data; 
    } 

    public static boolean findNextPermutation(int data[]) 
    { 
  
        if (data.length <= 1) 
            return false; 
  
        int last = data.length - 2; 
  
        // find the longest non-increasing suffix 
        // and find the pivot 
        while (last >= 0) { 
            if (data[last] < data[last + 1]) { 
                break; 
            } 
            last--; 
        } 
  
        if (last < 0) 
            return false; 
  
        int nextGreater = data.length - 1; 
        for (int i = data.length - 1; i > last; i--) { 
            if (data[i] > data[last]) { 
                nextGreater = i; 
                break; 
            } 
        } 
        data = swap(data, nextGreater, last); 
  
        data = reverse(data, last + 1, data.length - 1); 
        return true; 
    } 

    static boolean are_equal(int a[],int b[]){
        int n=a.length;
        for(int i=0;i<n;i++)
            if(a[i]!=b[i])
                return false;

        return true;
    }
    public static void process()throws IOException
    {
        int n=ni(),l=0,r=0,arr[]=new int[n],p[]=new int[n],q[]=new int[n];
        for(int i=0;i<n;i++){
            p[i]=ni();
            arr[i]=i+1;
        }
        for(int i=0;i<n;i++) q[i]=ni();

        int cnt=0;
        while(findNextPermutation(arr)){
            //System.out.println(Arrays.toString(arr));
            cnt++;
            if(are_equal(p,arr))
                l=cnt;
            if(are_equal(q,arr))
                r=cnt;
        } 
        pn(Math.abs(r-l));
    }


    static AnotherReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc=new AnotherReader();
        boolean oj = true;

        //oj = System.getProperty("ONLINE_JUDGE") != null;
        if(!oj) sc=new AnotherReader(100);

        long s = System.currentTimeMillis();
        int t=1;
        //t=ni();
        while(t-->0)
            process();
        out.flush();
        if(!oj)
            System.out.println(System.currentTimeMillis()-s+"ms");
        System.out.close();  
    }
    
    
    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static void pni(Object o){out.println(o);System.out.flush();}
    static int ni()throws IOException{return sc.nextInt();}
    static long nl()throws IOException{return sc.nextLong();}
    static double nd()throws IOException{return sc.nextDouble();}
    static String nln()throws IOException{return sc.nextLine();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
    static boolean multipleTC=false;
    static long mod=(long)1e9+7l;
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