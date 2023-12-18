import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    Map<Integer,Integer> map = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      map.put(sc.nextInt(), sc.nextInt());
    }
    long ans = 0;
    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int p = m - entry.getKey();
      if (m == 0) {
        break;
      }
      ans += 0;
    }
    System.out.println();
  }
}