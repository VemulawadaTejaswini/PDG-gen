
import java.util.Scanner;
 
public class Main {
  static int k;
  static String s;
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    s = scanner.nextLine();
    k = scanner.nextInt();
    scanner.close();
 
    char[] c = s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
        if (k == 0) {
            break;
        }
        if ((int) c[i] + k > 122) {
            k -= (123 - (int) c[i]);
            c[i] = 'a';
        }
    }
    k = k % 26;
    c[s.length() - 1] = (char) (c[s.length() - 1] + k);
    if (c[s.length() - 1] > 122) {
        c[s.length() - 1] = (char) (c[s.length() - 1] - 26);
    }
    s = String.valueOf(c);
    System.out.println(s);
  }
}