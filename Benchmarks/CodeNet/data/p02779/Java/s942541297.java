import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] sNumbers = sc.nextLine().split(" ");
    List<Integer> numbers = new ArrayList<>();
    for (String sn : sNumbers) {
      if (!numbers.contains(Integer.parseInt(sn))) {
        numbers.add(Integer.parseInt(sn));
      }
    }
    if (numbers.size() == N) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
