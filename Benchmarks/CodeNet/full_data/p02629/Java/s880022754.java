import java.io.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long[] nums = new long[21];
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Math.pow(26, i) > n) {
                pos = i;
                break;
            }
        }
        for (int i = pos - 1; i >= 0; i--) {
            double conv = Math.pow(26, i);
            System.out.print((char)(((long)(n / conv)) + 96));
            
            n = n - (long)(n / conv) * (long)(conv);
        }
       
    }
}
