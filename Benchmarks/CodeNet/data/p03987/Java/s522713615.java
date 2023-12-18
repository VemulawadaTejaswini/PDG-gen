/* AtCoder My Practice
 * author: Leonardone @ NEETSDKASU
 */
import java.util.Scanner;
 
public class Main
{
    static class Range
    {
        int lower, upper, depth = 1;
        Range lbound = null, ubound = null;
        Range(int l, int u) { lower = l; upper = u; }
    }
    
    static int depth(Range range)
    {
        if (range == null) { return 0; }
        else { return range.depth; }
    }
    
    static Range rotate(Range range)
    {
        Range tmp;
        int ld = depth(range.lbound);
        int ud = depth(range.ubound);
        range.depth = Math.max(ld, ud) + 1;
        if (Math.abs(ld - ud) < 2) { return range; }
        tmp = range;
        if (ud > ld) {
            int uld = depth(range.ubound.lbound);
            int uud = depth(range.ubound.ubound);
            if (uud > uld) {
                range = tmp.ubound;
                tmp.ubound = range.lbound;
                range.lbound = tmp;
            } else {
                range = tmp.ubound.lbound;
                tmp.ubound.lbound = range.ubound;
                range.ubound = tmp.ubound;
                tmp.ubound = range.lbound;
                range.lbound = tmp;
            }
        } else {
            int lld = depth(range.lbound.lbound);
            int lud = depth(range.lbound.ubound);
            if (lud > lld) {
                range = tmp.lbound.ubound;
                tmp.lbound.ubound = range.lbound;
                range.lbound = tmp.lbound;
                tmp.lbound = range.ubound;
                range.ubound = tmp;
            } else {
                range = tmp.lbound;
                tmp.lbound = range.ubound;
                range.ubound = tmp;
            }
        }
        tmp.depth = Math.max(depth(tmp.lbound), depth(tmp.ubound)) + 1;
        range.depth = Math.max(depth(range.lbound), depth(range.ubound)) + 1;
        return range;
    }
    
    static Range appendMax(Range range, Range newone)
    {
        if (range == null) { return newone; }
        range.ubound = appendMax(range.ubound, newone);
        return rotate(range);
    }
    
    static Range appendMin(Range range, Range newone)
    {
        if (range == null) { return newone; }
        range.lbound = appendMin(range.lbound, newone);
        return rotate(range);
    }
    
    static long sum = 0L, len;
    
    static Range calc(Range range, int value, int index)
    {
        if (range.lower <= index && index <= range.upper) {
            len = (long)(range.upper - range.lower + 1);
            sum += (len * (len + 1L) / 2L) * (long)value;
            len = (long)(range.upper - index);
            sum -= (len * (len + 1L) / 2L) * (long)value;
            len = (long)(index - range.lower);
            sum -= (len * (len + 1L) / 2L) * (long)value;
            if (range.lower == index) {
                range.lower++;
            } else if (range.upper == index) {
                range.upper--;
            } else if (range.upper - index > index - range.lower) {
                range.lbound = appendMax(range.lbound, new Range(range.lower, index - 1));
                range.lower = index + 1;
            } else {
                range.ubound = appendMin(range.ubound, new Range(index + 1, range.upper));
                range.upper = index - 1;
            }
        } else if (index < range.lower) {
            range.lbound = calc(range.lbound, value, index);
        } else {
            range.ubound = calc(range.ubound, value, index);
        }
        return rotate(range);
    }
    
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int[] idx = new int[n + 1];
        
        for (int i = 0; i < n; i++)
        {
            int a = in.nextInt();
            idx[a] = i;
        }
        
        Range range = new Range(0, n - 1);
        
        for (int i = 1; i <= n; i++)
        {
            range = calc(range, i, idx[i]);
        }
        
        System.out.println(sum);
    }
    
    
}