import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long X = sc.nextLong();
        long[] L = new long[N];
        long cnt = 0;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            L[i] = sc.nextLong();
        }

        for (int i = 0; i < N; i++) {
            if (sum <= X) cnt++;
            else break;
            sum += L[i];
        }

        System.out.println(cnt);
    }
}
