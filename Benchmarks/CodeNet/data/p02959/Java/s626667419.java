import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> A = new ArrayList<Integer>();
    List<Integer> B = new ArrayList<Integer>();
    for (int i = 0; i < n + 1; i++)
      A.add(sc.nextInt());
    for (int i = 0; i < n; i++)
      B.add(sc.nextInt());
    int result = 0;
    for (int i = 0; i < n; i++)
      if (A.get(i) > B.get(i)) {
        result += B.get(i);
        A.set(i, A.get(i) - B.get(i));
        B.set(i, 0);
      } else {
        result += A.get(i);
        B.set(i, B.get(i) - A.get(i));
        A.set(i, 0);
        if (A.get(i + 1) > B.get(i)) {
          result += B.get(i);
          A.set(i + 1, A.get(i + 1) - B.get(i));
        } else {
          result += A.get(i + 1);
          A.set(i + 1, 0);
        }
      }
    System.out.println(result);
  }
}