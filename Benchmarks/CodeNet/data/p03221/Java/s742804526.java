import java.util.*;

public class Main {
  public static class K {
    ArrayList<Integer> list = null;

    public K() {
      this.list = new ArrayList<>();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] P = new int[M];
    int[] Y = new int[M];
    for (int i = 0; i < M; i++) {
      P[i] = sc.nextInt();
      Y[i] = sc.nextInt();
    }
    K[] K = new K[100001];
    for (int i = 1; i <= 100000; i++) {
      K[i] = new K();
    }
    for (int i = 0; i < M; i++) {
      K[P[i]].list.add(Y[i]);
    }
    for (int i = 0; i < M; i++) {
      Collections.sort(K[P[i]].list);
    }
    for (int i = 0; i < M; i++) {
      System.out.println(String.format("%06d", P[i]) + String.format("%06d", K[P[i]].list.indexOf(Y[i]) + 1));
    }
  }
}