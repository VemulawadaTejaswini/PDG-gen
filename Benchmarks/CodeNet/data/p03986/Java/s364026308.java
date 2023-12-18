import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    String x = sc.next();
    int sCount = 0;
    int tCount = 0;
    int delCount = 0;
    for (int i = 0; i < x.length(); i++) {
      if (x.charAt(i) == 'S') {
        tCount = 0;
        sCount++;
      } else {
        tCount++;
        if (tCount <= sCount) {
          delCount++;
        }
        if (i < x.length() - 1 && x.charAt(i + 1) == 'S') {
          sCount = 0;
        }
      }
    }
    int len = x.length() - delCount * 2;
    System.out.println(len);
  }
}
