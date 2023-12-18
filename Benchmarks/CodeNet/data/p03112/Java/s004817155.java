import java.util.*;

public class lazyfaith
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), q = in.nextInt();
        long[] s = new long[a], t = new long[b];
        
        for (int i = 0; i < a; i++)
            s[i] = in.nextLong();
        for (int i = 0; i < b; i++)
            t[i] = in.nextLong();
        for (int i = 0; i < q; i++)
        {
            long x = in.nextLong();
            int xs = nearer(x, s);
            int st = nearer(s[xs], t);
            long xst = Math.abs(s[xs] - x) + Math.abs(t[st] - s[xs]);
            int xt = nearer(x, t);
            int ts = nearer(t[xt], s);
            long xts = Math.abs(t[xt] - x) + Math.abs(s[ts] - t[xt]);
            System.out.println(Math.min(xst, xts));
        }
        
        in.close();
    }
    
    public static int nearer(long x, long[] a)
    {
        int lo = 0, hi = a.length-1, mid = 0;
        while (lo != hi)
        {
            mid = (lo + hi)/2;
            if (a[mid] > x) hi = mid - 1;
            else if (x - a[mid] < x + a[lo]) lo = mid + 1;
        }
        if (lo + 1 < a.length && Math.abs(x - a[lo+1]) < Math.abs(x - a[lo]))
                lo++;
        return lo;
    }
}