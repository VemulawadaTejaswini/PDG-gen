import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        int searched1 = 1;
        int count1 = N;
        for (int i = 0; i < N; i++) {
            if (P[i] == searched1) {
                searched1++;
                count1--;
            }
        }

        int searched2 = N;
        int count2 = N;
        for (int i = N - 1; i >= 0; i--) {
            if (P[i] == searched2) {
                searched2--;
                count2--;
            }
        }

        System.out.println(Math.min(count1, count2));
    }
}