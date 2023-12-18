/**
 * Created at 1:14 on 2019/03/06
 */

import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  static int N;

  public static void main(String[] args) {

    int n = sc.nextInt();
    N = n/2;

    ArrayList<Integer> a = new ArrayList(N);
    ArrayList<Integer> b = new ArrayList(N);

    for (int i=0; i<N; i++) {
      a.add(sc.nextInt());
      b.add(sc.nextInt());
    }

    ArrayList<Integer[]> rankingA = getRanking(a); //[0] 個数 [1] 数値
    ArrayList<Integer[]> rankingB = getRanking(b);

    if (rankingA.get(0)[1] != rankingB.get(0)[1]) {
      System.out.println(2 * N - rankingA.get(0)[0] - rankingB.get(0)[0]);
    } else {
      System.out.println(2 * N - Math.max(
              rankingA.get(0)[0] + rankingB.get(1)[0],
              rankingA.get(1)[0] + rankingB.get(0)[0]
      ));
    }

  }

  static ArrayList<Integer[]> getRanking(ArrayList<Integer> list) {
    ArrayList<Integer[]> ranking = new ArrayList(N);
    for (int i=0; i<N;) {
      for (int j=i+1; j<=N; j++) {
        if (j == N || list.get(j) != list.get(i)) {
          ranking.add(new Integer[]{j-i, list.get(i)});
          i = j - 1;
          break;
        }
      }
    }

    ranking.sort((x, y) -> y[0]-x[0]);

    if (ranking.size() == 1) {
      ranking.add(new Integer[]{0, -1});
    }

    return ranking;
  }

}
