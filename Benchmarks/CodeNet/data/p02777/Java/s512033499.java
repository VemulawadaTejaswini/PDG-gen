import java.util.Scanner;

public class Main{
  private void main(String[] args){
    Scanner scanner = new Scanner();
    Scanner scanInt = new Scanner(System.in);
    String S = scanner.next();
    String T = scanner.next();
    int a = scanInt.nextInt();
    int b = scanInt.nextInt();
    String U = scanner.next();
    
    S = U ? a-- : b--;
    System.out.println(a + " " + b);
    
  }
}