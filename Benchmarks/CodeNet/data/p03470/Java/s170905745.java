import java.util.*;
import java.io.*;

class Main {
  int N;
  int[] d;
  Integer[] D;
  int count;
  public static void main(String[] args) {
    Main m = new Main();
    m.input();
    m.solve();
    m.out();
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    d = new int[N];
    for(int i = 0; i < N; i++) {
      d[i] = sc.nextInt();
    }
    sc.close();
  }

  public void solve() {
    D = new Integer[N];
    for(int i = 0; i < N; i++) {
      D[i] = Integer.valueOf(d[i]);
    }
    Arrays.sort(D, Comparator.reverseOrder());
    count = 1;
    for(int i = 1; i < N; i++) {
      if(D[i] == D[i - 1]) {
        continue;
      } else {
        count++;
      }
    }
  }

  public void out() {
    System.out.println(count);
  }
}
