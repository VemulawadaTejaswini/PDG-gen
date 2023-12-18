import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Pair implements Comparable<Pair> {
    final int key;
    final int cnt;

    public Pair (int key, int cnt) {
        this.key = key;
        this.cnt = cnt;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.cnt, other.cnt);
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(N, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return Integer.compare(a.cnt, b.cnt);
            }
        });

        int[] counter = new int[200001];;
        for (int i = 0; i < N; i++) {
            counter[A[i]]++;
        }

        for (int i = 0; i < 200001; i++) {
            if (counter[i] != 0) {
                pq.offer(new Pair(i, counter[i]));
            }
        }

        int cnt = 0;
        while (pq.size() > K) {
            Pair p = pq.poll();
            cnt += p.cnt;
        }
        System.out.println(cnt);
        return;
    }

}