import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int M = scan.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        for (int i = 0; i < A; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < B; i++) {
            b[i] = scan.nextInt();
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(a[0]+b[0]);
        for (int i = 0; i < M; i++) {
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;
            int c = scan.nextInt();
            queue.add(a[x] + b[y] - c);
        }
        System.out.println(queue.poll());
    }
}
