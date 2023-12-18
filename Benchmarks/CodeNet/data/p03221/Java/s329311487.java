import java.util.*;

public class Main {
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
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    for (int i = 1; i <= N; i++) {
      map.put(i, new ArrayList<>());
    }
    for (int i = 0; i < M; i++) {
      map.get(P[i]).add(Y[i]);
    }
    for (int i = 1; i <= N; i++) {
      Collections.sort(map.get(i)); // 昇順にソート
    }
    for (int i = 0; i < M; i++) {
      System.out.println(String.format("%06d", P[i]) + String.format("%06d", map.get(P[i]).indexOf(Y[i]) + 1));
    }
  }
}