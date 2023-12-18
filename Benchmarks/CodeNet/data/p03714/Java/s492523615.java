import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> front = new PriorityQueue<>();
        PriorityQueue<Integer> back = new PriorityQueue<>();
        int[] arr = new int[n];
        long frontSum = 0;
        long backSum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            frontSum += x;
            front.add(x);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            backSum += x;
            back.add(-x);
        }
        long[] values = new long[n + 1];
        values[0] = frontSum;
        values[n] = - backSum;
        for (int i = 0; i < n; i++) {
            frontSum += arr[i];
            front.add(arr[i]);
            frontSum -= front.poll();
            values[i + 1] += frontSum;
            backSum += arr[n - i - 1];
            back.add(- arr[n - i - 1]);
            backSum += back.poll();
            values[n - i - 1] -= backSum;
        }
        long max = Long.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            max = Math.max(max, values[i]);
        }
        System.out.println(max);
    }
}