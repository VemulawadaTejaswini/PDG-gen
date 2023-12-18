import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String S = ns();
        Set<Character> dir = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            dir.add(S.charAt(i));
        }

        int ns = 0;
        if (dir.contains('N')) {
            ns++;
        }

        if (dir.contains('S')) {
            ns++;
        }

        int we = 0;
        if (dir.contains('W')) {
            we++;
        }

        if (dir.contains('E')) {
            we++;
        }

        if (ns % 2 == 0 && we % 2 == 0) {
            out.println("Yes");
        } else {
            out.println("No");
        }

    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static int[] niarr(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static long[] nlarr(int N) {
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }
}