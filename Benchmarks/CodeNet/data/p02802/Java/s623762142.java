
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    String p[] = new String[10000000];

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
      } else {
        p[setsumon[i] - 1] += "X";
        wrong++;
      }
    }

    int n_wrong = 0;
    for (int i = 0; i < m; i++) {
      if (!"AC".equals(p[setsumon[i] - 1])) {
        n_wrong += p[setsumon[i] - 1].length();
      }
    }

    System.out.println(seikai + " " + (wrong - n_wrong));
  }
}
