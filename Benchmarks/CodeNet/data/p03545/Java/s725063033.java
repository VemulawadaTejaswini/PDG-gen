import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    static String s;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s = in.next();
        int n = s.length();

        // bit: 1 -> +, 0 -> -
        for(int i = 0; i < 1 << n-1; i++) {
            String ss = s;
            for(int j = n-1; j > 0; j--) {
                if((1 & (i >> j-1)) == 1) {
                    ss = ss.substring(0, j) + "+" + ss.substring(j);
                }else{
                    ss = ss.substring(0, j) + "-" + ss.substring(j);
                }
            }

            int ans = 0;
            boolean add = true;
            int current = 0;
            for(int j = 0; j < 7; j++) {
                if(j % 2 == 0) {
                    current = Integer.parseInt(ss.substring(j, j+1));
                    if(add) ans += current;
                    else ans -= current;
                }else{
                    add = (ss.charAt(j) == '+');
                }
            }
            if (ans == 7) {
                print(ss + "=7");
                return;
            }
        }
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(char c) {
        System.out.println(c);
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