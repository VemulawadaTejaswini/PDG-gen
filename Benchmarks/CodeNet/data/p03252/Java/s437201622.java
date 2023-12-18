import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            String T = in.next();

            int N = S.length();

            int[] same = new int['z' - 'a' + 1];
            int[] other = new int['z' - 'a' + 1];
            for (int i = 0; i < N; i++) {
                int s = S.charAt(i) - 'a';
                int t = T.charAt(i) - 'a';
                if (s == t) {
                    same[s]++;
                } else {
                    other[s]++;
                    other[t]++;
                }
            }

            for (int i = 0; i < same.length; i++) {
                if (same[i] >= 1 && other[i] >= 1) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}
