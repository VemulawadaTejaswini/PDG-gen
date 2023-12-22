import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String t = sc.next();
    String answer = t.replace("?", "D");
    System.out.println(answer);
  }
}