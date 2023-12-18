import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static final String DELIMITER = " ";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] lines = scanner.nextLine().split(DELIMITER);
    // aもbも割り切れる正整数のうちk番目に大きいもの
    int a = Integer.valueOf(lines[0]);
    int b = Integer.valueOf(lines[1]);
    int k = Integer.valueOf(lines[2]);
    List<Integer> divA = div(a);
    List<Integer> divB = div(b);
    List<Integer> common = new ArrayList<>();
    int aSize = divA.size();
    int bSize = divB.size();
    
    if (aSize > bSize) {
      for (int e: divA) {
        if (divB.contains(e)) common.add(e);
      }
    } else {
      for (int e: divB) {
        if (divA.contains(e)) common.add(e);
      }
    }
    
    int result = common.get(k - 1);
    System.out.println(result);
  }

  private static List<Integer> div(int d) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <=d; i++) {
      if (d % i == 0) list.add(i);
    }
    return list;
  }
}