import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static long B;
  static long C;
  // static int[][] map;
  static double min = 9999999;
  static long ans = 0;

  static class pair implements Comparable{
          public int a;
          public long b;
          public int c;
          public int d;

          pair(){
              this.a = 0;
              this.b = 0;
              this.c = 0;
              this.d = 0;
          }

          pair(int a, long b, int c, int d){
              this.a = a;
              this.b = b;
              this.c = c;
              this.d = d;
          }

          public void set(int a, long b, int c, int d) {
              this.a = a;
              this.b = b;
              this.c = c;
              this.d = d;
          }

    @Override
    public int compareTo(Object o) {
      if(this.b > ((pair)o).b)return 1;
      if(this.b < ((pair)o).b)return -1;
      if(this.c > ((pair)o).c)return 1;
      return -1;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] map = new int[N];
    pair[] p = new pair[M];

    int cnt = 0;
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt();
      long b = scanner.nextLong();
      int c = cnt;

      p[i] = new pair(a, b, i, 0);

    }
    
    Arrays.sort(p);

    for (int i = 0; i < M; i++) {
      map[p[i].a - 1]++;
      p[i].set(p[i].a, 0, p[i].c, map[p[i].a - 1]);

    }

    Arrays.sort(p);
    for (int i = 0; i < M; i++) {
//      System.out.println(p[i].d);
      System.out.printf("%06d%06d", p[i].a, p[i].d);
      System.out.println();
    }


  }
}
