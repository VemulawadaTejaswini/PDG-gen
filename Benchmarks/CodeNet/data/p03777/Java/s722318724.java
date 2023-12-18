import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int aa = 1;
    int bb = 1;
    if (a.equals("D")) aa = -1;
    if (b.equals("D")) bb = -1;
    if (aa * bb > 0) {
      System.out.println("H");
    } else {
      System.out.println("D");
    }
  }
}
