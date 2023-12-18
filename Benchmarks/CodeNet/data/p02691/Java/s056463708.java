import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        Map<Integer, Integer> L = new HashMap<>();
        Map<Integer, Integer> R = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            int abs = A[i] + (i + 1);
            L.put(abs, L.getOrDefault(abs, 0) + 1);
            final int abs1 = (i + 1) - A[i];
            R.put(abs1, R.getOrDefault(abs1, 0) + 1);
        }

        int sum = 0;
        for (Integer ll : L.keySet()) {
            sum += L.get(ll) * R.getOrDefault(ll, 0);
        }
        System.out.println(sum);
    }
}