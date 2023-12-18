import java.util.*;import java.io.*;import java.math.*;

public class Main
{

    public static void process()throws IOException
    {
        char arr[]=(" "+nln()).toCharArray();
        int n=arr.length-1;
        TreeSet<Integer> right = new TreeSet<Integer>();
        TreeSet<Integer> left = new TreeSet<Integer>();

        int res[]=new int[n+1];

        for(int i=1;i<=n;i++){
            if(arr[i]=='L')
                left.add(i);
            else
                right.add(i);
        }

        for(int i=1;i<=n;i++){
            if(arr[i]=='L'){
                int idx=right.lower(i);
                if((i-idx-1)%2==0)
                    res[idx+1]++;
                else
                    res[idx]++;
            }
            else{
                int idx=left.higher(i);
                if((idx-i-1)%2==0)
                    res[idx-1]++;
                else
                    res[idx]++;
            }
        }

        for(int i=1;i<=n;i++)p(res[i]+" ");
        pn("");
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