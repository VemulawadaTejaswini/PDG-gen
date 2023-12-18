import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if ((a - b) % 2 == 0) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            long min = Math.min(a, b);
            long max = Math.max(a, b);
            long zAns = min;
            max -= min;
            zAns += max / 2;
            max = Math.max(a, b);
            long nAns = n - max + 1;
            min -= nAns;
            nAns += min / 2;
            System.out.println(Math.min(zAns, nAns));
        }
    }
}