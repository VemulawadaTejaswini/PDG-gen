import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main
{
    static int deal_with(int money, int stocks, int day, int n, int arr[]){
        if(day > n)
            return money;

        if(dp[money][stocks][day] != -1)
            return dp[money][stocks][day];

        //sell stock
        for(int i = 0; i <= stocks; i++){ 
            dp[money][stocks][day] =  Math.max(dp[money][stocks][day],
                   deal_with(money + arr[day] * i, stocks - i, day + 1, n, arr));


        }

        //buy stock
        int buy = 0;
        while((buy + 1) * arr[day] <= money){
            buy++;
            dp[money][stocks][day] = Math.max(dp[money][stocks][day],
                deal_with(money - (arr[day] * buy), stocks + buy, day + 1, n, arr));
        }
        //if(day == n) trace(dp[money][stocks][day]);
        return dp[money][stocks][day];
    }

    public static void process(int test_number)throws IOException
    {
        int n = ni(), arr[] = new int[n+1];
        for(int i = 1; i <= n; i++)
            arr[i] = ni();

        //dp = new int[1600 + 10][1000+1][80 + 1];
        for(int ht[][] : dp)
            for(int w[] : ht)
                Arrays.fill(w, -1);

        pn(deal_with(1000, 0, 1, n, arr));
    }
    static int dp[][][] = new int[1600+10][200 +1][80 + 1];
    static final long mod = (long)1e9+7l;
    
    static FastReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc = new FastReader();
 
        long s = System.currentTimeMillis();
        int t = 1;
        //t = ni();
        for(int i = 1; i <= t; i++)
            process(i);
 
        out.flush();
        System.err.println(System.currentTimeMillis()-s+"ms");
    }

    static void trace(Object... o){ System.err.println(Arrays.deepToString(o)); };
    static void pn(Object o){ out.println(o); }
    static void p(Object o){ out.print(o); }
    static int ni()throws IOException{ return Integer.parseInt(sc.next()); }
    static long nl()throws IOException{ return Long.parseLong(sc.next()); }
    static double nd()throws IOException{ return Double.parseDouble(sc.next()); }
    static String nln()throws IOException{ return sc.nextLine(); }
    static long gcd(long a, long b)throws IOException{ return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{ return (b==0)?a:gcd(b,a%b); }
    static int bit(long n)throws IOException{ return (n==0)?0:(1+bit(n&(n-1))); }
    
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
