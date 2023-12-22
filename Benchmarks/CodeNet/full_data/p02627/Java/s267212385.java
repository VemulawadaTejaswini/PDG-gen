import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char a = s.charAt(0);
    if (a >= 'A' && a <= 'Z') {
      System.out.println("A");
    } else {
      System.out.println("a");
    }
  }
}    