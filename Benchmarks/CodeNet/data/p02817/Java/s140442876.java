import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan;
    String S;
    String T;
    
    Systrm.out.println("文字を入力してください");
    scan = new Scanner(System.in);
    S = scan.next();
    T = scan.next();
    
    System.out.println(T + S);
  }
}
