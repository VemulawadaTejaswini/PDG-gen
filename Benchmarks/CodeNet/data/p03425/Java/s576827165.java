import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Set<String> MARCH_SET = new HashSet<>();
    static {
        MARCH_SET.add("M");
        MARCH_SET.add("A");
        MARCH_SET.add("R");
        MARCH_SET.add("C");
        MARCH_SET.add("H");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        String[] march = new String[N];
        for (int i = 0; i < N; i++) {
            String initial = String.valueOf(sc.next().charAt(0));
            if (MARCH_SET.contains(initial)) {
                march[i] = initial;
            }
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                String one = march[i];
                String two = march[j];

                if (one == null || two == null || one.equals(two)) {
                    continue;
                }

                for (int j2 = j + 1; j2 < N; j2++) {
                    String thr = march[j2];

                    if (one == null || two == null || thr == null) {
                        continue;
                    }
                    if (one.equals(two) || two.equals(thr) || one.equals(thr)) {
                        continue;
                    }
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
