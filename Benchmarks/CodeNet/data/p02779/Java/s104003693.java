import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            HashSet<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < N; i++) {
                set.add(A[i]);
            }

            System.out.println(set.size() == N ? "YES" : "NO");
        }
    }
}