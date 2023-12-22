import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }

        int money = 1000;
        int start = -1;
        int end = -1;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] < A[i + 1]) {
                if (start == -1) start = A[i];
                if (i == N - 2) end = A[i + 1];
            }

            if ((A[i] > A[i + 1]) && (start != -1)) {
                end = A[i];
            }

            if ((start != -1) && (end != -1)) {
                money += (end - start) * (money / start);

                start = -1;
                end = -1;
            }
        }

        System.out.println(money);
    }
}