import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] s = br.readLine().split("\\s+");
      int n = Integer.parseInt(s[0]);
      int m = Integer.parseInt(s[1]);
      int[] a = Arrays.stream(br.readLine().split("\\s+"))
        .mapToInt(Integer::parseInt).toArray();
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for (int i=0;i<n;i++) pq.offer(a[i]);
      for (int i=0;i<m;i++) {
        s = br.readLine().split("\\s+");
        int b = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);
        for (int j=0;j<b;j++) {
          int d = pq.peek();
          if (d >= c) break;
          d = pq.poll();
          pq.offer(c);
        }
      }
      long sum = 0L;
      for (int i=0;i<n;i++) sum += (long)pq.poll();
      System.out.println(sum);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}