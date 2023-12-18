import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] pic = new String[H];
        for (int i = 0; i < H; i++) {
            pic[i] = sc.next();
        }

        for (int i = -2; i < W; i++)
            System.out.print('#');
        System.out.println();
        for (int i = 0; i < H; i++) {
            System.out.println('#' + pic[i] + '#');
        }

        for (int i = -2; i < W; i++)
            System.out.print('#');
        System.out.println();
    }

    public static void main(String[] args) {
        new Main();
    }
}
