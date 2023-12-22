import java.util.*;
import java.lang.Math;
public class Main {
    public static void main (String [] args)
    {
        long max = (long)Math.pow(10,18);
        Scanner s = new Scanner(System.in);
        
        int len = s.nextInt();
        boolean isZero = false;
        boolean tooLong = false;
        int[] nums = new int[len];
        for(int i = 0; i < len; i++)
        {
            nums[i] = s.nextInt();
            if(nums[i] == 0)
            {
                isZero = true;
            }
        }
        int result = 1;
        
        for(int i = 0; i < len && !isZero; i++)
        {
            if(1000000000000000001L/result >= nums[i])
            {
                result *= nums[i];
            }
            else
            {
                tooLong = true;
                break;
            }
        }

        if(isZero)
        {
            System.out.println(0);
        }
        else if(tooLong)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(result);
        }
    }
}