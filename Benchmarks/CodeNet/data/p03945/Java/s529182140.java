import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();

    char preC = s.charAt(0);
    int count = 0;
    for (char c : s.toCharArray()) {
      if (c != preC) {
        count += 1;
      }
      preC = c;
    }
    System.out.println(count);
  }
}
