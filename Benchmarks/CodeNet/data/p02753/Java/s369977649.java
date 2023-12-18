import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S;
    S = sc.next();
    sc.close();
    if (S.equals("AAA") | S.equals("BBB"))
    {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    } 
  }
}