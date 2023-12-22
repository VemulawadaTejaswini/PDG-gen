import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

//        boolean[] picked = new boolean[N];
        int max = 0;
        Set<Integer>[] relations = new HashSet[N];
        for (int i = 0; i < N; i++) {
            relations[i] = new HashSet<>();
        }

        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            relations[A-1].add(B-1);
            relations[B-1].add(A-1);
        }

        for (int i = 0; i < N; i++) {
            if (max < relations[i].size() + 1) {
                max = relations[i].size() + 1;
            }
        }

        System.out.println(max);
    }
}