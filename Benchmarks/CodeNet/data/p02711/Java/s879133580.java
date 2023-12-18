import java.util.Scanner;
 
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    System.out.println(N.contains("7") ? "Yes" : "No");
  }
}