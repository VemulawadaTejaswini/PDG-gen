import java.util.*;
import java.io.*;

public class Main
{
    public static void main (String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt() ;
        int [] a = new int[n] ;

        TreeMap<Integer,Integer> map1 = new TreeMap<>();
        TreeMap<Integer,Integer> map2 = new TreeMap<>();

        for(int i = 0 ;i < n ;i++) {
            a[i] = sc.nextInt();
            if((i & 1) == 0)
                map1.put(a[i], map1.getOrDefault(a[i] , 0) + 1) ;
            else
                map2.put(a[i], map2.getOrDefault(a[i] , 0) + 1) ;
        }

        int max1 = 0 ;
        for(int x : map1.values())
            max1 = Math.min(max1 , x) ;

        int ans = n / 2 - max1 ;

        int max2 = 0;
        for(int x : map2.values())
            max2 = Math.min(max2 , x) ;

        if(max2 == n / 2 && map1.firstKey().intValue() == map2.firstKey().intValue())
            ans += max2 ;
        else
            ans += n / 2 - max2 ;


        out.print(ans);
        out.flush();
        out.close();
    }

    static class Scanner
    {
        BufferedReader br;
        StringTokenizer st;

        Scanner(InputStream in)
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws Exception
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws Exception { return Integer.parseInt(next()); }

        long nextLong() throws Exception { return Long.parseLong(next()); }

        double nextDouble() throws Exception { return Double.parseDouble(next());}
    }

    static void shuffle(int [] a)
    {
        int n =a.length ;

        for(int i = 0 ;i < n ; i++)
        {
            int r = i + (int)(Math.random() * (n - i)) ;
            int tmp = a[i] ;
            a[i] = a[r] ;
            a[r] = tmp ;
        }
    }

}