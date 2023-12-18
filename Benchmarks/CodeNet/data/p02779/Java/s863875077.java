import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] sNumbers = sc.nextLine().split(" ");
    List<Integer> numbers = new ArrayList<>();
    for (String sn : sNumbers) {
      numbers.add(Integer.parseInt(sn));
    }
    int count = 0;
    for (int n : numbers) {
      for (int n2 : numbers) {
        if (n == n2) {
          count++;
        }
      }
    }
    if (count == N) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
