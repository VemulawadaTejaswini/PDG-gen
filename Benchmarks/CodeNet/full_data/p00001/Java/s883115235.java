
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      values.add(Integer.parseInt(scanner.nextLine()));
    }

    values.sort(Comparator.reverseOrder());

    for (int i = 0; i < 3; i++) {
      System.out.println(values.get(i));
    }
  }
}

