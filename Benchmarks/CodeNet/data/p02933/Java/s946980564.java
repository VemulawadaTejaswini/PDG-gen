import java.util.*;

public class Main {
  public static void main(String[] args) {
    int a;
    String s;
    try(Scanner sc = new Scanner(System.in)) {
      a = sc.nextInt();
      s = sc.next();
    }
    System.out.println(a >= 3200 ? s : "red");
  }
}