import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // 0は使わない 1 - nまで
    Athlete[] athletes = new Athlete[n+1];
    for(int i = 1; i <= n; i++) {
      int[] a = new int[n];
      for(int j = 0; j < n-1; j++) a[j] = sc.nextInt();
      athletes[i] = new Athlete(a);
    }
    athletes[0] = new Athlete(new int[n]);
    long count = 0; // 何回試合したかの個数
    int done = 0; // すべて戦い終えたやつの個数
    boolean didFight = true;
    while(done != n) { // すべて試合を終えるか 試合が終えられないか
      didFight = false;
      HashSet<Integer> finishFightThisTurn = new HashSet<>();
      for(int i = 1; i <= n; i++) {
        // i = athlete number
        // enemyNum = enemy number
        if (finishFightThisTurn.contains(i)) continue;
        Athlete athlete = athletes[i];
        if (athlete.index == n - 1) continue;
        int enemyNum = athlete.wantToFight[athlete.index];
        if (finishFightThisTurn.contains(enemyNum)) continue;
        Athlete enemy = athletes[enemyNum];
        enemy.enemyNum.add(i);
        if (athlete.enemyNum.contains(enemyNum)) { // 互いに戦いたいかの確認 => 試合
          didFight = true;
          athlete.enemyNum.remove(enemyNum);
          athlete.index++;
          enemy.enemyNum.remove(i);
          enemy.index++;
          if (athlete.index == n - 1) done++;
          if (enemy.index == n - 1) done++;
          finishFightThisTurn.add(i);
          finishFightThisTurn.add(enemyNum);
        }
      }
      if (!didFight) {
        System.out.println(-1);
        return;
      }
      count++;
    }
    System.out.println(count);
  }
  public static class Athlete {
    HashSet enemyNum;
    int index = 0;
    int[] wantToFight;
    Athlete(int[] a) {
      enemyNum = new HashSet();
      wantToFight = a;
    }
  }
}
