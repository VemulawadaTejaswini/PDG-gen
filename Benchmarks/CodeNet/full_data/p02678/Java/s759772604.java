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
            q.offer(new int[]{i + 1, ary[i], 0});
            set.add(i + 1);
        }

        long sum = 0;
        while(!q.isEmpty())
        {
            int first = set.first(), last = set.last();

            Queue<int[]> qq = new PriorityQueue<>((a, b)->(
                b[2] != a[2] ? b[2] - a[2] : a[0] - b[0]));
            while(!q.isEmpty())
            {
                int[] p = q.poll();
                p[2] = p[1] * Math.max(Math.abs(p[0] - first), Math.abs(p[0] - last));
                // System.out.println(Arrays.toString(p));
                qq.offer(p);
            }
            // System.out.println("..");

            int[] next = qq.poll();
            // System.out.println(Arrays.toString(next));

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
            // System.out.println(sum);
            while(!qq.isEmpty()) q.offer(qq.poll());
        }
        out.println(sum);
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
        int[] ary = toIntArray();
        int a = ary[0], b = ary[1], h = ary[2], m = ary[3];
        double min_ang = (1.0 * m / 60) * 2 * Math.PI;
        double hour_ang = (1.0 * h / 12 + 1.0 * m / 60 / 12) * 2 * Math.PI;
        double x1 = a * Math.cos(hour_ang), y1 = a * Math.sin(hour_ang),
                x2 = b * Math.cos(min_ang), y2 = b * Math.sin(min_ang);
        double dx = x1 - x2, dy = y1 - y2;
        System.out.println(Math.sqrt(dx * dx + dy * dy));
    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        int k = readInt();
        String str = in.readLine();
        if(str.length() <= k) System.out.println(str);
        else
        {
            str = str.substring(0, k);
            str += "...";
            System.out.println(str);
        }
    }

    void a() throws Exception
    {
        int n = readInt();
        int rem = n % 10;

        String ans = "";
        if(rem == 3) ans = "bon";
        if(rem == 2 || rem == 4 || rem == 5 || rem == 7 || rem == 9) ans = "hon";
        if(rem == 0 || rem == 1 || rem == 6 || rem == 8) ans = "pon";
        System.out.println(ans);
    }
}