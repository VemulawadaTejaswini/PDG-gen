import java.util.*;
public class Main {
  private static long INF = 100_000_000_000L;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    int K = sc.nextInt();
    long[] A = inputAndSort(sc, X);
    long[] B = inputAndSort(sc, Y);
    long[] C = inputAndSort(sc, Z);
    
    Set<List<Integer>> checked = new HashSet<>();
    int count = 0;
    PriorityQueue<Cur> q = new PriorityQueue<>((a, b)-> {
      if (b.sum == a.sum) {
        return 0;
      }
      return a.sum < b.sum ? 1 : -1;
    });
    
    q.offer(new Cur(X-1, Y-1, Z-1, A[X-1]+B[Y-1]+C[Z-1]));
    while (!q.isEmpty() && count < K) {
      Cur c = q.poll();
      if (checked.contains(c.key)) {
        continue;
      }
      checked.add(c.key);
      count++;
      System.out.println(c.sum);
      if (c.x > 0) {
        q.offer(new Cur(c.x-1, c.y, c.z, A[c.x-1]+B[c.y]+C[c.z]));
      }
      if (c.y > 0) {
        q.offer(new Cur(c.x, c.y-1, c.z, A[c.x]+B[c.y-1]+C[c.z]));
      }
      if (c.z > 0) {
        q.offer(new Cur(c.x, c.y, c.z-1, A[c.x]+B[c.y]+C[c.z-1]));
      }
    }
  }
  private static long[] inputAndSort(Scanner sc, int n) {
    long[] ret = new long[n];
    for (int i = 0; i < n; i++) {
      ret[i] = sc.nextLong();
    }
    Arrays.sort(ret);
    return ret;
  }
  
  private static class Cur {
    final List<Integer> key;
    final int x;
    final int y;
    final int z;
    final long sum;
    Cur(int x, int y, int z, long sum) {
      this.key = asList(x, y, z);
      this.x = x;
      this.y = y;
      this.z = z;
      this.sum = sum;
    }
  }
  private static List<Integer> asList(int x, int y, int z) {
    List<Integer> ret = new ArrayList<>();
    ret.add(x);
    ret.add(y);
    ret.add(z);
    return ret;
  }
}