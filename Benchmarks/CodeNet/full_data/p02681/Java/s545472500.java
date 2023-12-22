import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int len_s = s.length();
    if(t.length() - s.length() == 1 && s.equals(t.substring(0, s.length()))){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}