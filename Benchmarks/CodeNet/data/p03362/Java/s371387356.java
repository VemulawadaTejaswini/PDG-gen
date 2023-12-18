import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int max = 55555;
        PriorityQueue<Integer> pq = prime(max);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(pq.poll());
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }

    static PriorityQueue<Integer> prime(int n) {
        boolean[] is_prime = new boolean[n+1];
        Arrays.fill(is_prime, true);
        is_prime[0] = is_prime[1] = false;
        PriorityQueue<Integer> pq = new PriorityQueue<>(n);
        for (int i = 2; i <= n; i++) {
            if (!is_prime[i]) {
                continue;
            }

            is_prime[i] = true;
            pq.add(i);
            for (int j = 2 * i; j <= n; j += i) {
                is_prime[j] = false;
            }
        }

        return pq;
    }
}
