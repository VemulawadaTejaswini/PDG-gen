import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    for(int i=0; i<10; i++) {
      if(S.charAt(i) != T.charAt(i)) {
        System.out.println("No");
      } else if(S.charAt(i) == T.charAt(i)) {
        System.out.println("Yes");
      }
    }
  }
}