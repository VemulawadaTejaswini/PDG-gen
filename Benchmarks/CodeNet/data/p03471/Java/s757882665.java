import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;

    static int n, target;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        target = in.nextInt();

        for(int i = 0; i < 2*n+1; i++) {
            for(int j = i+1; j <= 2*n+2; j++) {
                int xi = i;
                int yi = j;
                if(xi % 2 == 1) xi--;
                if(yi % 2 == 1) yi--;
                int x = xi/2;
                int y = yi/2 - x;
                int z = n - y - x;
                if(x*10000 + y*5000 + z*1000 == target) {
                    System.out.format("%d %d %d\n", x, y, z);
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