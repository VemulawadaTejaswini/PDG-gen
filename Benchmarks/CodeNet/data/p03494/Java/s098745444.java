
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int inNumber = scanner.nextInt();
    List iList = new ArrayList<Integer>();
    for (int i = 0; i < inNumber; i++) {
      int num = scanner.nextInt();
      iList.add(num);
    }

    boolean isTrue = true;
    int count = 0;

    while (isTrue) {
      for (int i = 0; i < iList.size(); i++) {
        if ((int) iList.get(i) % 2 == 0) {
          iList.set(i, (int) iList.get(i) / 2);
        } else {
          isTrue = false;
          break;
        }
      }
      if (isTrue) {
        count++;
      }
    }

    System.out.println(count);

  }

}
