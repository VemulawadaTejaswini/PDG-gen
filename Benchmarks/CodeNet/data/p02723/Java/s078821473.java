import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    char[] b = a.toCharArray();
    boolean ans = false;
    if(b[2] == b[3] && b[4] == b[5]) ans = true;
    if(ans){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}