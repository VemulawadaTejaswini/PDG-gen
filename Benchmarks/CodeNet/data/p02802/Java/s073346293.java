
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    String p[] = new String[10000000];
    String w[] = new String[10000000];

    int setsumon[] = new int[10000000];
    String answer[] = new String[10000000];

    for (int i = 0; i < m; i++) {
      setsumon[i] = sc.nextInt();
      answer[i] = sc.next();
    }

    int seikai = 0;
    int wrong = 0;
    for (int i = 0; i < m; i++) {
      if ("AC".equals(p[setsumon[i] - 1])) {
        continue;
      }
      if (answer[i].equals("AC")) {
        p[setsumon[i] - 1] = "AC";
        seikai++;
        if (w[setsumon[i] - 1] != null && !"".equals(w[setsumon[i] - 1])) {
          wrong += w[setsumon[i] - 1].length();
        }

      } else {
        if (w[setsumon[i] - 1] != null) {
          w[setsumon[i] - 1] = w[setsumon[i] - 1] + "X";
        } else {
          w[setsumon[i] - 1] = "X";
        }
      }
    }

    System.out.println(seikai + " " + wrong);
  }
}
