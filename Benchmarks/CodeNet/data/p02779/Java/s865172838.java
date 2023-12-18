import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      int val = sc.nextInt();
      if (list.contains(val)) {
        System.out.println("NO");
        return;
      } else {
        list.add(val);
      }
    }
    System.out.println("YES");
  }
}
