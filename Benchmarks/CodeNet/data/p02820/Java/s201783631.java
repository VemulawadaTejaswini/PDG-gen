            
import java.util.*;import java.io.*;import java.math.*;

public class Main
{

    public static void process()throws IOException
    {
        int n=ni(),k=ni(),r=ni(),s=ni(),p=ni();
        char arr[]=(" "+nln()).toCharArray();

        for(int i=1;i<=n;i++){
            if(arr[i]=='r')
                arr[i]='p';
            else if(arr[i]=='p')
                arr[i]='s';
            else
                arr[i]='r';
        }

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('r',r);
        map.put('p',p);
        map.put('s',s);

        long res=0l;

        ArrayList<Character> li[]=new ArrayList[k+1];
        for(int i=1;i<=k;i++){
            li[i]=new ArrayList<Character>();
            for(int j=i;j<=n;j+=k)
                li[i].add(arr[j]);
            
        }

        for(int i=1;i<=k;i++){
            ArrayList<Character> x=li[i];
            
            int len=x.size();
            x.add(' ');
            for(int j=0;j<len;j++){
                char a=x.get(j),b=x.get(j+1);
                int score=map.get(a);
                res+=score*1l;
                if(a==b)
                    j++;
            }
        }
        pn(res);
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

    static void r_sort(int arr[],int n){
        Random r = new Random(); 
        for (int i = n-1; i > 0; i--){ 
            int j = r.nextInt(i+1); 
                  
            int temp = arr[i]; 
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