import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    if(S.equals("ABC")) {
      System.out.println("ARC");
    } else if(S.equals("ARC")) {
      System.out.println("ABC");
    }
  }
}