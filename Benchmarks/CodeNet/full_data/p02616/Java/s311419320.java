import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    public static void process()throws IOException
    {
        int n = ni(), k = ni();
        ArrayList<Integer> li = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int x = ni();
            li.add(x);
        }

        Collections.sort(li, (A, B)-> -Math.abs(A) + Math.abs(B));

        int cnt_neg = 0, idx = 0;

        for(int i = 0 ; i < n; i++){
            int x = li.get(i);
            if(x < 0)
                cnt_neg++;
        }

        if(cnt_neg == n){
            Collections.sort(li, (A, B)-> Math.abs(A) - Math.abs(B));
            long pt = 1l;
            for(int i = 0; i < k ; i++){
                long x = li.get(i);
                pt = pt * x;
            }   
            if(pt < 0)
                pt = (pt + mod)%mod;
            pn(pt);
            return ;
        }

        if(cnt_neg==0)
            cnt_neg = -1;
        else if(cnt_neg % 2 == 1 && cnt_neg != n )
            cnt_neg--;

        long res = 1l;

        for(int i = 0; i < k; i++){
            int x = li.get(idx);
            if(x < 0  && cnt_neg == 0){
                i--;
                idx++;
                continue;
            }

            if(x < 0)
                cnt_neg--;
            
            idx++;
            res = (res * x) %mod;
            if(res < 0)
                res = (res + mod) % mod;

        }

        if(res < 0)
            res = (res + mod)%mod;
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