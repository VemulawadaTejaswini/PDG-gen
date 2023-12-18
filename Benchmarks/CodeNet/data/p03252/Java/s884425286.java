import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String S = ns();
        String T = ns();

        Map<Character, Character> t2S = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (t2S.containsKey(T.charAt(i)) && t2S.get(T.charAt(i)).compareTo(S.charAt(i)) != 0) {
                out.println("No");
                return;
            }
            t2S.put(T.charAt(i), S.charAt(i));
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