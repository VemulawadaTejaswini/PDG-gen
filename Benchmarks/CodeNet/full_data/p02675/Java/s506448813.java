import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int a = 0;
    if (n.length() == 3) {
      a = Integer.parseInt(n.substring(2));
    } else if (n.length() == 2){
      a = Integer.parseInt(n.substring(1,2));
    } else {
      a = Integer.parseInt(n);
    }

    if (a == 2 || a == 4 || a == 5 || a == 7 || a == 9) {
      System.out.println("hon");
    } else if (a == 3) {
      System.out.println("bon");
    } else {
      System.out.println("pon");
    }
  }
}