/* AtCoder My Practice
 * author: Leonardone @ NEETSDKASU
 */
import java.util.Scanner;
 
public class Main
{
    static class Range
    {
        int lower, upper;
        Range lbound = null, ubound = null;
        Range(int l, int u) { lower = l; upper = u; }
    }
    
    static Range range;
    static long sum = 0L;
    
    static void calc(int value, int index)
    {
        Range tmp = range;
        long len;
        for (;;)
        {
            if (tmp.lower <= index && index <= tmp.upper)
            {
                len = (long)(tmp.upper - tmp.lower + 1);
                sum += (len * (len + 1L) * 2L) * (long)value;
                len = (long)(tmp.upper - index);
                sum -= (len * (len + 1L) * 2L) * (long)value;
                len = (long)(index - tmp.lower);
                sum -= (len * (len + 1L) * 2L) * (long)value;
                if (tmp.lower == index)
                {
                    tmp.lower++;
                }
                else if (tmp.upper == index)
                {
                    tmp.upper--;
                }
                else
                {
                    tmp.lbound = new Range(tmp.lower, index - 1);
                    tmp.ubound = new Range(index + 1, tmp.upper);
                    tmp.lower = tmp.upper = index;
                }
            }
            else if (index < tmp.lower)
            {
                tmp = tmp.lbound;
            }
            else
            {
                tmp = tmp.ubound;
            }
        }
    }
    
    static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int[] idx = new int[n + 1];
        
        for (int i = 0; i < n; i++)
        {
            int a = in.nextInt();
            idx[a] = i;
        }
        
        range = new Range(0, n - 1);
        
        for (int i = 0; i < n; i++)
        {
            calc(i, idx[i]);
        }
        
        System.out.println(sum);
    }
    
    
}