import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N, M, K, res = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        Deque<Integer> q1 = new ArrayDeque<Integer>();
        for (int i = 0; i < N; i++) {
            q1.add(sc.nextInt());
        }
        Deque<Integer> q2 = new ArrayDeque<Integer>();
        for (int i = 0; i < M; i++) {
            q2.add(sc.nextInt());
        }
        q1.add(1000000000);
        q2.add(1000000000);
        while (K >= 0) {
            if (q1.getFirst() < q2.getFirst()) {
                K -= q1.getFirst();
                q1.removeFirst();
                res++;
            } else {
                K -= q2.getFirst();
                q2.removeFirst();
                res++;
            }
        }
        if(K<0) res--;

        System.out.println(res);
    }
}
