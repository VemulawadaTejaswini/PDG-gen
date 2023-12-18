import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int count = 0;
    int i = 0;
    while (i < n - 2) {
        if (s.substring(i, i + 3).equals("ABC")) {
            count++;
            i = i + 3;
        } else {
            i++;
        }
    }
    System.out.println(count);
  }
}
