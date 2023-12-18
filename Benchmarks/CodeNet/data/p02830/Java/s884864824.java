import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final String S = sc.next();
        final String T = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            sb.append(S.substring(i, i+1));
            sb.append(T.substring(i, i+1));
        }

        System.out.println(sb);
    }
}