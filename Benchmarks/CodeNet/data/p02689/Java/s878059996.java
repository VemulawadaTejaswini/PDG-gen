
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] H = new int[N + 1];
        int[] maxH = new int [N + 1];

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 1 ; i <= N ; i++) {
            H[i] = scanner.nextInt();
            map.put(i, new HashSet<>());
            maxH[i] = H[i];
        }


        for (int i = 0 ; i < M ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (H[b] <= maxH[a]) {
                maxH[a] = H[b];
            }
            if (H[a] <= maxH[b]) {
                maxH[b] = H[a];
            }
        }
        
        int count = 0;
        for (int i = 1 ; i <= N ; i++) {
            if (H[i] > maxH[i]) count++;
        }

        System.out.println(count);
    }
}
