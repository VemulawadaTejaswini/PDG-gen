import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String k = sc.nextLine();
    int kInt = Integer.parseInt(k);
    String s = sc.nextLine();
    if (s.length() > kInt) {
      s = s.substring(0, kInt);
      s += "...";
    }
    System.out.println(s);
  }
}
