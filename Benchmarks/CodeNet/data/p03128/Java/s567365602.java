import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] A = new int[M];
            for (int i = 0; i < M; i++) {
                A[i] = in.nextInt();
            }

            int[] n = new int[] { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6, };

            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = n[A[i]];
            }

            Comparator<String> comparator = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1 == null) {
                        if (o2 == null) {
                            return 0;
                        } else {
                            return 1;
                        }
                    } else {
                        if (o2 == null) {
                            return -1;
                        } else {
                        }
                    }

                    if (o1.length() > o2.length()) {
                        return -1;
                    }
                    if (o1.length() < o2.length()) {
                        return 1;
                    }
                    return -o1.compareTo(o2);
                }
            };

            String[] dp = new String[N + 1];
            dp[0] = "";
            for (int i = 0; i < dp.length; i++) {
                if (dp[i] == null) {
                    continue;
                }
                for (int j = 0; j < A.length; j++) {
                    if (i + B[j] > N) {
                        continue;
                    }
                    String next1 = A[j] + dp[i];
                    String next2 = dp[i] + A[j];
                    String next = comparator.compare(next1, next2) < 0 ? next1 : next2;
                    String current = dp[i + B[j]];
                    dp[i + B[j]] = comparator.compare(current, next) < 0 ? current : next;
                }
            }

            System.out.println(dp[N]);
        }
    }

}
