
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] parent = new int[N + 1];
        int[] rank = new int[N + 1];

        for (int i = 1 ; i <= N ; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        for (int i = 0 ; i < M ; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (rank[A] <= rank[B]) {
                parent[B] = parent[A];
                rank[B] = rank[A] + 1;
            } else {
                parent[A] = parent[B];
                rank[A] = rank[B] + 1;
            }
        }


        int count = -1;
        for (int i = 1 ; i <= N ; i++) {
            if (rank[i] == 0) count++;
        }


        System.out.println(count);
    }
}
