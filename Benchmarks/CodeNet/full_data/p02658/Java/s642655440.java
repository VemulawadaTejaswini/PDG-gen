import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static PrintWriter out = new PrintWriter(System.out);
    static String file = "../in";
    static int test = 10; // 0 for local testing, 1 for std input
    static int inf = 1_000_000, mod = 1_000_000_007;



    void swap(int[]ary, int i, int j)
    {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
    
    String[] split() throws Exception
    {
        return in.readLine().split(" ");
    }

    int readInt() throws Exception
    {
        return Integer.valueOf(in.readLine());
    }

    long[] toLongArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        long[] ary = new long[n];
        for(int i = 0; i < n; i++) ary[i] = Long.valueOf(sp[i]);
        return ary;
    }

    int[] toIntArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        return ary;
    }

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }


    long pow(long a, int pow)
    {
        long res = 1;
        while(pow > 0)
        {
            if(pow % 2 != 0) {
                res *= a;
                res %= mod;
            }
            a = a * a;
            a %= mod;
            pow /= 2;
        }

        return res;
    }

    public static void main(String[] args) throws Exception
    {
        int _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");
        char[] gg = in.readLine().toCharArray();}
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
        // System.out.println((-100 + 0) / 2);

        
        new Main().b();
        out.flush();
    }

    void e() throws Exception
    {
        int n = readInt();
        long[] a = new long[n], b = new long[n];
        for(int i = 0; i < n; i++)
        {
            long[] ary = toLongArray();    
            a[i] = ary[0];
            b[i] = ary[1];
        }
        
        long re = n;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] * a[j] + b[i] * b[j] != 0) re++;
            }
        }
        System.out.println(re);
        
    }

    void d() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], m = ary[1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++)
            map.put(i + 1, new ArrayList<>());
        for(int i = 0; i < m; i++)
        {
            ary = toIntArray();
            int u = ary[0], v = ary[1];
            map.get(u).add(v);
            map.get(v).add(u);
        }

        int[] f = new int[n + 1];
        Arrays.fill(f, n + 2);

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        int step = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            while(size-- > 0)
            {
                int cur = q.poll();
                for(int next : map.get(cur))
                {
                    if(f[next] <= step + 1) continue;
                    f[next] = step + 1;
                    q.offer(next);
                }
            }
            step++;
        }
        boolean found = true;
        for(int i = 2; i <= n; i++)
        {
            if(f[i] >= n + 2) found = false;
        }
        if(!found) 
        {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
        for(int i = 2; i <= n; i++)
        {
            System.out.println(f[i]);
        }
        
    }


    void c() throws Exception
    {
        String[] str = split();
        long a = Long.valueOf(str[0]);
        String part2 = "" + str[1].charAt(0) + str[1].charAt(2) + str[1].charAt(3);
        int b = Integer.valueOf(part2);
        long prod = a * b;
        prod /= 100;
        System.out.println(prod);
    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        int n = readInt();
        BigInteger prod = BigInteger.ONE,
                    cap = new BigInteger("10");
        cap = cap.pow(18);
        String[] split = split();
        
        for(int i = 0; i < n; i++)
        {
            prod = prod.multiply(new BigInteger(split[i]));
        }    
        if(prod.compareTo(cap) <= 0) System.out.println(prod);
        else System.out.println(-1);
        
    }

    void a() throws Exception
    {
        int[] ary = toIntArray();
        System.out.println(ary[0] * ary[1]);
    }
}