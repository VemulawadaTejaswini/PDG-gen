import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int countYen = 0;

        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            q.add(new int[]{sc.nextInt(), sc.nextInt()});
        }

        while (!q.isEmpty()) {
            int[] store = q.poll();
            if (store[1] < m) {
                countYen += store[0] * store[1];
                m -= store[1];
            } else {
                countYen += store[0] * m;
                break;
            }
        }
        System.out.println(countYen);
    }
}