import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;

    static String s;
    static long sum;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s = in.next();
        int n = s.length();

        for(int i = 0; i < 1 << n-1; i++) {
            String ss = s;
            for(int j = n-1; j >= 0; j--) {
                if((1 & i >> j) == 1) {
                    ss = ss.substring(0, j+1) + "-" + ss.substring(j+1);
                }
            }
            String[] nums = ss.split("-");

            long subsum = 0;
            for(int j = 0; j < nums.length; j++) {
                subsum += Long.parseLong(nums[j]);
            }

            sum += subsum;
        }

        print(sum);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(int i) {
        System.out.println(i);
    }

    static void print(long i) {
        System.out.println(i);
    }

    static void print(float i) {
        System.out.println(i);
    }
}
