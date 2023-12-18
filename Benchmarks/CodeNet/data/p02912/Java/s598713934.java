import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Long> a = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }

        for (int i = 0; i < m; i++) {
            long t = a.poll();
            a.add(t / 2);
        }

        long ans = a.stream().mapToLong(val -> val).sum();
        System.out.println(ans);
    }
}

