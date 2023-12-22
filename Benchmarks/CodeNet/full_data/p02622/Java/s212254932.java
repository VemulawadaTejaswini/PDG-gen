import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    int num = S.length();
    int counts = 0;
    for (int i = 0; i < num; i++) {
      if (S.charAt(i) != T.charAt(i)) {
        counts = counts + 1;
      }
    }
    System.out.println(counts);
  }
}
