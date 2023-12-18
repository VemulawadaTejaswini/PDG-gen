import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] same = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (A[i] == A[j]) {
                    same[i]++;
                    same[j]++;
                    sum++;
                }
        for (int i = 0; i < N; i++)
            System.out.println(sum - same[i]);
    }
}
