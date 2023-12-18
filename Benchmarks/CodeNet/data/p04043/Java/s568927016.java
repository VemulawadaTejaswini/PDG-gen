
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    List<Integer> iList = new ArrayList<Integer>();

    iList.add(sc.nextInt());
    iList.add(sc.nextInt());
    iList.add(sc.nextInt());

    int fCount = 0;
    int sCount = 0;
    for (int i : iList) {
      if (i == 5) {
        fCount++;
      }
      if (i == 7) {
        sCount++;
      }
    }

    if (fCount == 2 && sCount == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
