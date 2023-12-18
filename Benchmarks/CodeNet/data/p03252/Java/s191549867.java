import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String S = ns();
        String T = ns();

        Map<Character, Character> s2T = new HashMap<>();
        Map<Character, Character> t2S = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            char t = T.charAt(i);

            if (t2S.containsKey(t) && t2S.get(t) != s) {
                out.println("No");
                return;
            }

            if (s2T.containsKey(s) && s2T.get(s) != t) {
                out.println("No");
                return;
            }

            s2T.put(s, t);
            t2S.put(t, s);
        }

        out.println("Yes");
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