import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String title = sc.next();

    switch (title) {
      case "ABC":
        System.out.println("ARC");
        break;
      case "ARC":
        System.out.println("ABC");
        break;
    }
    sc.close();
  }
}