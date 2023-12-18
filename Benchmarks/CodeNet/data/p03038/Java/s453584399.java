import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
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
      PriorityQueue<Operation> op = new PriorityQueue<>(Comparator.reverseOrder());
      for (int i=0;i<n;i++) pq.offer(a[i]);
      for (int i=0;i<m;i++) {
        s = br.readLine().split("\\s+");
        int b = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);
        op.offer(new Operation(b,c));
      }
      for (int i=0;i<m;i++) {
        Operation o = op.poll();
        for (int j=0;j<o.b;j++) {
          int d = pq.peek();
          if (d >= o.c) break;
          d = pq.poll();
          pq.offer(o.c);
        }
      }
      long sum = 0L;
      for (int i=0;i<n;i++) sum += (long)pq.poll();
      System.out.println(sum);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  private class Operation implements Comparable<Operation> {
    int b,c;
    Operation(int b,int c) {
      this.b = b;
      this.c = c;
    }
    @Override
    public int compareTo(Operation other) {
      if (c == other.c) return Integer.compare(b,other.b);
      return Integer.compare(c,other.c);
    }
  }
}