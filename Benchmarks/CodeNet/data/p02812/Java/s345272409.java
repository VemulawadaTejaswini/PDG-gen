import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String s = scanner.nextLine();
    final int n = Integer.parseInt(s);
    final String s2 = scanner.nextLine();

    final String[] split = s2.split("");
   
    int a = 0;
    for (int i = 0; i <= n - 3; i++) {
      if (split[i].equals("A")
          && split[i+1].equals("B")
          && split[i+2].equals(("C"))) {
        a++;
      }
    }
    System.out.println(a);
  }
}
