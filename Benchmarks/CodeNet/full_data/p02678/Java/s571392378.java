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
        int M = sc.nextInt();

        int[] A = new int[M];
        int[] B = new int[M];

        List<List<Integer>> to = new ArrayList<>(100005);
        for (int i = 0; i < 100005; i++) {
            to.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();

            A[i]--;
            B[i]--;

            to.get(A[i]).add(B[i]);
            to.get(B[i]).add(A[i]);
        }

        int[] dist = new int[100005];
        Arrays.fill(dist, -1);
        int[] pare = new int[100005];
        Arrays.fill(pare, -1);

        dist[0] = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (Integer nv : to.get(v)) {
                if (dist[nv] < 0) {
                    dist[nv] = dist[v] + 1;
                    pare[nv] = v;
                    queue.offer(nv);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (i == 0) continue;
            if (dist[i] < 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < N; i++) {
            if (i == 0) continue;
            int p = pare[i];
            p++;
            System.out.println(p);
        }

        return;
    }

}