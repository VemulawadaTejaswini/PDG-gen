//
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

        
        new Main().d();
        out.flush();
    }

    void e() throws Exception
    {
        int n = readInt();
        int[] ary = toIntArray();
        
        Queue<int[]> q = new LinkedList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < n; i++)
        {
            q.offer(new int[]{i + 1, ary[i]});
            set.add(i + 1);
        }

        long sum = 0;
        while(!q.isEmpty())
        {
            int first = set.first(), last = set.last();
            Queue<int[]> qq = new PriorityQueue<>((a, b)->(
                b[1] * Math.max(Math.abs(b[0] - first), Math.abs(b[0] - last)) - 
                a[1] * Math.max(Math.abs(a[0] - first), Math.abs(a[0] - last))
                    ));
            while(!q.isEmpty()) qq.offer(q.poll());

            int[] next = qq.poll();
            System.out.println(Arrays.toString(next));

            int orignalPos = next[0], val = next[1];
            
            
            long sc1 = Math.abs(orignalPos - first),
                sc2 =  Math.abs(orignalPos - last);
            if(sc1 > sc2)
            {
                set.remove(first);
                sum += sc1 * val;
            }
            else
            {
                set.remove(last);
                sum += sc2 * val;
            }
            System.out.println(sum);
            while(!qq.isEmpty()) q.offer(qq.poll());
        }
        out.println(sum);
    }

    void d() throws Exception
    {
        int[] ary = toIntArray();
        int mod = 1_000_000_007;
        int n = ary[0], k = ary[1];
        long re = 0;
        for(int i = k; i <= n + 1; i++)
        {
            long mini = (0L + i) * (i - 1) / 2;
            long maxi = (0L + n + n - i + 1) * i / 2;
            // calculate if possible to obtain some number
            // System.out.printf("i = %d.. %d %d\n", i, mini, maxi);
            re += (maxi - mini + 1) % mod;
            re %= mod;
        }
        out.println(re % mod);
    }


    void c() throws Exception
    {
        int n = readInt();
        int[] ary = toIntArray();
        int[] f = new int[n + 1];
        for(int i = 0; i < n - 1; i++)
        {
            int from = ary[i];
            int to = i + 2;
            f[from]++;
        }

        for(int i = 1; i <= n; i++)
        {
            out.println(f[i]);
        }

    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        int[] ary = toIntArray();
        int n = ary[0], m = ary[1];

        ary = toIntArray();

        int sum = 0;
        for(int k : ary)
        {
            sum += k;
        }

        if(sum <= n) out.println(n - sum);
        else out.println(-1);
    }

    void a() throws Exception
    {
        int n = readInt();
        out.printf("%f", Math.PI * 2 * n);
    }
}