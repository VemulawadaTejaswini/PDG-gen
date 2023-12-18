import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    long K = Long.parseLong(sc.next());
    long[] count = new long[100001];
    for (int i =0; i<N; i++) {
      int a = Integer.parseInt(sc.next());
      count[a] += Long.parseLong(sc.next());
    }
    long total =0, ans =0;
    for (int i =0; i<100001; i++) {
      total += (long)count[i];
      if (total >= K)  {
        ans =i;
        break;
      }
    }
    System.out.println(ans);
  }
}