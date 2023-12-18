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

        
        new Main().b();
        out.flush();
    }

    void e() throws Exception
    {
        int[] ary = toIntArray();
        int x = ary[0], y = ary[1], a = ary[2], b = ary[3], c = ary[4];

        int[] red = toIntArray(), green = toIntArray(), white = toIntArray();

        Arrays.sort(red);
        Arrays.sort(green);
        Arrays.sort(white);

        long redHP = 0, greenHP = 0;
        Queue<Integer> rstack = new PriorityQueue<>(), gstack = new PriorityQueue<>();
        
        for(int i = 0; i < x; i++)
        {
            redHP += red[a - 1 - i];
            rstack.offer(red[a - 1 - i]);
        }
        for(int i = 0; i < y; i++)
        {
            greenHP += green[b - 1 - i];
            gstack.offer(green[b - 1 - i]);
        }

        // now try to pop the smallest one and add in the biggest one
        // System.out.printf("%d %d\n", redHP, greenHP);

        int widx = c - 1;
        int inf = 1 << 30;
        while(widx >= 0)
        {

            int minRed = rstack.isEmpty() ? inf : rstack.peek(), 
                minGreen = gstack.isEmpty() ? inf : gstack.peek();
            
            int curWhite = white[widx];
            if(minRed >= curWhite && minGreen >= curWhite) break;
            if(minRed < minGreen)
            {
                redHP -= minRed;
                rstack.poll();
                redHP += curWhite;
            }
            else
            {
                greenHP -= minGreen;
                gstack.poll();
                greenHP += curWhite;
            }
            widx--;
        }
        out.println(redHP + greenHP);
    }

    void d() throws Exception
    {
        int k = readInt();
        // lun(k);
        Queue<Long> q = new LinkedList<>();

        for(long i = 1; i <= 9; i++) q.offer(i);
        while(k-- > 1)
        {
            long cur = q.poll();
            long last = cur % 10;
            if(last != 0 && last != 9)
            {
                q.offer(cur * 10 + last - 1);
                q.offer(cur * 10 + last);
                q.offer(cur * 10 + last + 1);
            }
            else
            {
                if(last == 0)
                {
                    q.offer(cur * 10 + last);
                    q.offer(cur * 10 + last + 1);
                }
                else
                {
                    q.offer(cur * 10 + last - 1);
                    q.offer(cur * 10 + last);
                }
            }
        }
        out.println(q.poll());
    }

    void lun(int k)
    {
        int a = 1, idx = 1;
        while(k > 0)
        {
            if(isLun(a))
            {
                System.out.printf("%d %d\n", idx++, a);
                k--;
            }
            a++;
        }
    }

    boolean isLun(int n)
    {
        String str = String.valueOf(n);
        int len = str.length();
        for(int i = 0; i < len - 1; i++)
        {
            char c1 = str.charAt(i), c2 = str.charAt(i + 1);
            if(Math.abs(c1 - c2) > 1) return false;
        }
        return true;
    }

    void c() throws Exception
    {
        long[] ary = toLongArray();
        long n = ary[0], k = ary[1];
        n %= k;
        long n1 = n, n2 = Math.abs(n - k);
        // System.out.println(n1);
        // System.out.println(n2);
        out.println(Math.min(n1, n2));
    }

    void b() throws Exception
    {
        int n_ = readInt();
        long n = (long) n_;
        long sum = n * (n + 1) / 2;
        long m1 = n / 3, m2 = n / 5, m3 = n / 15;
        // out.println(sum);

        sum -= 3 * m1 * (m1 + 1) / 2 + 
               5 * m2 * (m2 + 1) / 2 - 
               15 * m3 * (m3 + 1) / 2;

        out.println(sum);
    }

    void a() throws Exception
    {
        int n = readInt();
        boolean flag = false;
        while(n > 0)
        {
            if(n % 10 == 7) flag = true;
            n /= 10;
        }
        if(flag) out.println("Yes");
        else out.println("No");
    }
}