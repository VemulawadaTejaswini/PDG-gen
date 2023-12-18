import java.util.*;
import java.math.*;

public class Main{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = sc.nextLong();
    long a = sc.nextLong();
    long[][] num = new long[n][2];
    for(int i = 0; i < n; ++i) {
      num[i][0] = sc.nextLong();
      num[i][1] = sc.nextLong();
    }
    Arrays.sort(num, new Comparator<long[]>() {
      public int compare(long[] x, long[] y){
        if(x[0] > y[0]) return 1;
        else return -1;
      }
    });
    long tot = 0;
    long res = 0;
    List<long[]> list = new LinkedList<>();
    for(int i = 0; i < n; ++i) {
      while(!list.isEmpty() && num[i][0] > list.get(0)[0]) {
        tot -= list.remove(0)[1];
      }
      long cur = num[i][1] - tot;
      if(cur > 0) {
        long time = cur / a + ((cur % a == 0) ? 0 : 1);
        list.add(new long[]{num[i][0] + 2 * d, time * a});
        tot += time * a;
        res += time;
      } 
    }
    System.out.println(res);
  }
}