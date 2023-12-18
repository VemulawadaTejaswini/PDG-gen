import java.util.*;

class Main {
  static int max_chairs = 10;
  static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String s = sc.next();
    if (a >= 3200) {
      System.out.println(s);
    } else {
      System.out.println("red");
    }
  }
}