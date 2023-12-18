import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = scanner.nextInt();
    List<Integer> intArray = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      int y = scanner.nextInt();
      intArray.add(y);
    }

    int count = 1;
    int sum = 0;


    for (Integer i : intArray) {
      sum  = sum + i;
      if(sum > x) {
        break;
      }
      count++;
    }

    System.out.println(count);
  }

}