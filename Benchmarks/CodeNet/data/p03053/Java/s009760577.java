import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt();
        int[][] A = new int[H][W];
        Queue Q = new Queue();
        for (int h = 0; h < H; h++) {
            String s = sc.next();
            for (int w = 0; w < W; w++) {
                int b = A[h][w] = s.charAt(w) == '#' ? 1 : 0;
                if (b == 1) Q.add(0, h, w);
            }
        }
        int ans = 0;
        while (!Q.isEmpty()) {
            Que q = Q.poll();
            ans = q.n;
            if (q.y > 0 &&     A[q.y - 1][q.x] == 0) A[q.y - 1][q.x] = Q.add(q.n + 1, q.y - 1, q.x);
            if (q.y < H - 1 && A[q.y + 1][q.x] == 0) A[q.y + 1][q.x] = Q.add(q.n + 1, q.y + 1, q.x);
            if (q.x > 0 &&     A[q.y][q.x - 1] == 0) A[q.y][q.x - 1] = Q.add(q.n + 1, q.y, q.x - 1);
            if (q.x < W - 1 && A[q.y][q.x + 1] == 0) A[q.y][q.x + 1] = Q.add(q.n + 1, q.y, q.x + 1);
        }
        System.out.println(ans);
        sc.close();
    }
}
class Que {
    int n, x, y;
    Que(int n, int y, int x) {
        this.n = n;
        this.x = x;
        this.y = y;
    }
}
class Queue {
    Deque<Que> Q;
    Queue() {
        Q = new ArrayDeque<>();
    }
    int add(int n, int y, int x) {
        Q.add(new Que(n, y, x));
        return n;
    }
    boolean isEmpty() { return Q.isEmpty(); }
    Que poll() { return Q.poll(); }
}
