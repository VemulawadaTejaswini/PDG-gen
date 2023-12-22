import java.io.*;
import java.util.*;

public class Main {
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        new Main().run();
    }
    void debug(Object ... o) {
        System.out.println(Arrays.deepToString(o));
    }
    int a, b;
    boolean init() {
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == 0 && b == 0) return false;
        return true;
    }
    ArrayList<Integer> factor(int n) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                ret.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        return ret;
    }
    int key(int n) {
        ArrayList<Integer> factors = factor(n);
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        int biggest = factors.get(factors.size() - 1);
        sum -= biggest;
        return biggest - sum;
    }
    void run() {
        while (init()) {
            System.out.println(key(a) > key(b) ? "a" : "b");
        }
    }
}