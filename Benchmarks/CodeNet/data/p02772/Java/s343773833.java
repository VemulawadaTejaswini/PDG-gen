import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    List<Integer> a = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      a.add(scanner.nextInt());
    }
    if(a.stream().filter(e -> e % 2 == 0).allMatch(e -> e% 3 == 0 || e% 5 == 0)) {
      System.out.println("APPROVED");
    } else {
      System.out.println("DENIED");
    }
  }
}
