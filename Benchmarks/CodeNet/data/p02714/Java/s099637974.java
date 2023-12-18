import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        long R = 0;
        long G = 0;
        long B = 0;
        long ans;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                R++;
            } else if (S.charAt(i) == 'G') {
                G++;
            } else if (S.charAt(i) == 'B') {
                B++;
            }
        }
        ans = R * B * G;

        long sum = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                if (2 * j - i >= N) {
                    continue;
                }
                if (S.charAt(i) != S.charAt(j) && S.charAt(i) != S.charAt(2 * j - i)
                        && S.charAt(j) != S.charAt(2 * j - i)) {
                    sum++;
                }
            }
        }

        System.out.println(ans - sum);
        sc.close();
    }
}
