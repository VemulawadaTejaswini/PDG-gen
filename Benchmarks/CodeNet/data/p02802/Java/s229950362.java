
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    String p[] = new String[1000000];

    int setsumon[] = new int[1000000];
    String answer[] = new String[1000000];

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
        wrong++;
      }
    }

    System.out.println(seikai + " " + wrong);
  }
}
