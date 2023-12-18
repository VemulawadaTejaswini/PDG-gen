import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N - K + 1; i++) {
            min = Math.min(min, h[i + K - 1] - h[i]);
        }

        System.out.println(min);
        return;
    }

}
