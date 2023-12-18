
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    boolean bool = false;

    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        list.add(i * j);
      }
    }

    for (int i = 0; i < list.size(); i++) {
      if (N == list.get(i)) {
        bool = true;
        break;
      }
    }

    if (bool == true) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }
}
