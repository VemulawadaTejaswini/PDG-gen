import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;

    static int n, target;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        target = in.nextInt();

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                int k = n - i - j;
                if(k < 0) continue;

                if(i*10000 + j*5000 + k*1000 == target) {
                    System.out.format("%d %d %d\n", i, j, k);
                    return;
                }
            }
        }

        print("-1 -1 -1");
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