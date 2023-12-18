import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long[] A = new long[N];
        for(int i =0; i < N; i++) {
            A[i] = scanner.nextLong();
        }

        List<Long> list = new ArrayList<>();
        for(int j = 0; j < N-1; j++) {
            for(int i = j+1; i < N; i++) {
                list.add(A[i] * A[j]);
            }
        }
        java.util.Collections.sort(list);

        System.out.println(list.get(K-1));
    }
}
