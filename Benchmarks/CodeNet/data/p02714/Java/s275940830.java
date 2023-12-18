import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        long sum = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    continue;
                }
                for (int k = j + 1; k < N; k++) {
                    if (S.charAt(i) == S.charAt(k) || S.charAt(k) == S.charAt(j) || j - i == k - j) {
                        continue;
                    }
                    sum++;
                }
            }
        }

        System.out.printf("%d\n", sum);
        sc.close();
    }
}