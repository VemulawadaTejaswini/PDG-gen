import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final String S[] = new String[N];
        final int T[] = new int[N];
        for (int i=0; i<N; i++) {
            S[i] = sc.next();
            T[i] =  Integer.parseInt(sc.next());
        }
        final String X = sc.next();
        sc.close();

        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<N; i++) {
            map.put(S[i], T[i]);
        }

        int total = 0;
        boolean b = false;
        for (int i=0; i<N; i++) {
            if (b)
                total += map.get(S[i]);
            if (X.equals(S[i]))
                b = true;
        }

        System.out.println(total);
    }
}