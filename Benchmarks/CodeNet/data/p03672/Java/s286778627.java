import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = new char[s.length()];
    c = s.toCharArray();
    for(int i = s.length()-2; i >= 0; i--) {
      int j = (i + 1) / 2;

      for(int k = 0; k < j; k++) {
        if(k+j > i) break;
        if(c[k] != c[k+j]) {
          break;
        }
        if(k == j-1) {
          System.out.println(2*(k+1));
          return;
        }
      }
    }
  }
}
