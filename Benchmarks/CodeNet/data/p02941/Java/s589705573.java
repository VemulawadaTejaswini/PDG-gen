
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();

        LinkedList<Integer> indices = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int prev = i > 0 ? i - 1 : N - 1;
            int next = i < N - 1 ? i + 1 : 0;
            if (B[i] > A[i] && B[i] > B[prev] + B[next]) indices.add(i);
        }

        int sol = 0;

        while (!indices.isEmpty()) {
            int i = indices.pollLast();
            int prev = i > 0 ? i - 1 : N - 1;
            int next = i < N - 1 ? i + 1 : 0;
            int prevprev = prev > 0 ? prev - 1 : N - 1;
            int nextnext = next < N - 1 ? next + 1 : 0;

            if ((B[i] - A[i]) % (B[prev] + B[next]) == 0) {
                sol += (B[i] - A[i]) / (B[prev] + B[next]);
                B[i] = A[i];
            } else {
                int times = Math.min(B[i] / (B[prev] + B[next]), (B[i] - Math.max(B[prev], B[next]) + 1));
                sol += times;
                B[i] -= times * (B[prev] + B[next]);
            }

            if (B[prev] > A[prev] && B[prev] > B[i] + B[prevprev]) indices.addLast(prev);
            if (B[next] > A[next] && B[next] > B[i] + B[nextnext]) indices.addLast(next);
        }

        for (int i = 0; i < N; i++) {
            if (A[i] != B[i]) {
                sol = -1;
                break;
            }
        }

        System.out.println(sol);
    }
}
