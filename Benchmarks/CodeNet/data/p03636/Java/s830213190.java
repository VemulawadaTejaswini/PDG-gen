import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String count = String.valueOf(str.length() - 2);

    System.out.println(str.charAt(0) + count + str.charAt(str.length() - 1));
  }
}
