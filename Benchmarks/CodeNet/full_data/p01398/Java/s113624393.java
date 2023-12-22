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
    int N;
    char [] message;
    int [] a, b;
    boolean init() {
        N = sc.nextInt();
        if (N == 0) return false;
        a = new int[N];
        b = new int[N];
        message = sc.next().toCharArray();
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
        }
        return true;
    }
    int rotate(char c, int d) {
        return ((c - 'a') + d) % 26 + 'a';
    }
    void decipher(int ai, int bi) {
        int d = Math.abs(ai - bi);
        message[ai] = (char)rotate(message[ai], d);
        message[bi] = (char)rotate(message[bi], d);
        char p = message[ai];
        char q = message[bi];
        message[ai] = q;
        message[bi] = p;
    }
    void run() {
        while (init()) {
            for (int i = a.length-1; i >= 0; i--) {
                decipher(a[i], b[i]);
            }
            System.out.println(message);
        }
    }
}