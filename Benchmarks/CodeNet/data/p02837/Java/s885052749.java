import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    List<Statement>[] statements = new List[N];
    for (int i = 0; i < N; i++) {
      statements[i] = new ArrayList<>();
      int a = scanner.nextInt();
      for (int j = 0; j < a; j++) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        statements[i].add(new Statement(x - 1, y == 1));
      }
    }
 
    int max = 0;
    loop:
    for (int i = 0; i < (1 << N); i++) {
      for (int j = 0; j < N; j++) {
        if (((1 << j) & i) == 1) {
          for (Statement s : statements[j]) {
            if (((1 << s.who) & i) == 0 && s.honest) continue loop;
            if (((1 << s.who) & i) != 0 && !s.honest) continue loop;
          }
        }
      }
      max = Math.max(max, Integer.bitCount(i));
    }
    System.out.println(max);
  }
 
  private static class Statement {
    final int who;
    final boolean honest;
 
    private Statement(int who, boolean honest) {
      this.who = who;
      this.honest = honest;
    }
  }
}