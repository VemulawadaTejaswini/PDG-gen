import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        final int P[] = new int[M];
        final String S[] = new String[M];
        for (int i=0; i<M; i++) {
            P[i] = Integer.parseInt(sc.next());
            S[i] = sc.next();
        }
        sc.close();

        int a1[] = new int[N+1];
        int b1[] = new int[N+1];
        for (int i=0; i<M; i++) {
            if ("AC".equals(S[i])) {
                a1[P[i]] = 1;
            } else {
                if (a1[P[i]]==0) {
                    b1[P[i]]++;
                }
            }
        }
        int sum1 = Arrays.stream(a1).sum();
        int sum2 = Arrays.stream(b1).sum();
        System.out.println(sum1 + " " + sum2);
    }
}