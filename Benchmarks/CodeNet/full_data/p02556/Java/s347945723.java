
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner sc = new Scanner(is);
        int N = sc.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        for(int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            max1 = Math.max(max1, x[i]+y[i]);
            min1 = Math.min(min1, x[i]+y[i]);
            max2 = Math.max(max2, x[i]-y[i]);
            min2 = Math.min(min2, x[i]-y[i]);
        }
        long diff = max1-min1;
        long diff2 = max2-min2;
        os.println(Math.max(diff, diff2));
    }

}