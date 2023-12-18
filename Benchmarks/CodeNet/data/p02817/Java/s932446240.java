import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan;
    String S;
    String T;
    
    System.out.println("文字を入力してください");
    scan = new Scanner(System.in);
    S = scan.next();
    T = scan.next();
    
    System.out.println(T + S);
  }
}
