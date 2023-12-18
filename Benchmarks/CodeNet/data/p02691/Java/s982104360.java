import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            int ll = A[i] + i;
            int rr = i - A[i];
            sum += map.getOrDefault(rr, 0);
            map.put( ll, map.getOrDefault(ll, 0) + 1);
        }
        System.out.println(sum);
    }
}