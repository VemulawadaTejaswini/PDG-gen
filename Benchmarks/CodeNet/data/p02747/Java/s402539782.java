import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){ 
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    String hiCount = str.replaceAll("hi", "").length();
    if(hiCount == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}