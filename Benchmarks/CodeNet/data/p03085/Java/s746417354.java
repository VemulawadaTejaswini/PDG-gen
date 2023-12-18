import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String b = sc.nextLine();
    if (b.equals("A")) {
      System.out.println("T");
    } else if (b.equals("T")) {
      System.out.println("A");
    } else if (b.equals("C")) {
      System.out.println("G");
    } else {
      System.out.println("C");
    }
  }
}