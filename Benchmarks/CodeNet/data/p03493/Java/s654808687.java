import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int count = 0;

    if (s[0] == '1') count += 1;
    if (s[1] == '1') count += 1;
    if (s[2] == '1') count += 1;

    System.out.print(count)
  }
}
