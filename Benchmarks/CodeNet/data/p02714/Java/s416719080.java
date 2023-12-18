import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = sc.next().split("");
        sc.close();

        long r = 0;
        long g = 0;
        long b = 0;

        for (String s : S) {
            if (s.equals("R")) {
                r++;
            } else if (s.equals("G")) {
                g++;
            } else {
                b++;
            }
        }

        long total = r * g * b;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (S[i].equals(S[j])) {
                    continue;
                }
                int k = 2 * j - i;
                if (k >= N || S[k].equals(S[i]) || S[k].equals(S[j])) {
                    continue;
                }

                sum++;
            }
        }

        System.out.println(total - sum);

    }
}
