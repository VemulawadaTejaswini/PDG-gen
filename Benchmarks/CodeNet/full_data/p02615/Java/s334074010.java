import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Queue<Integer> queue = new ArrayDeque<>();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
    Arrays.sort(arr);
    int sum = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (i == n - 1) {
        queue.add(arr[i]);
        continue;
      }
      queue.add(arr[i]);
      sum += queue.poll();
    }
    System.out.println(sum);
  }
}
