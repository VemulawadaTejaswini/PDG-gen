import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();
    if(s.equals(t.substring(0, s.length()))){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}