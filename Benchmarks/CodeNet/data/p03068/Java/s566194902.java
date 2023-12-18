import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int k = sc.nextInt();
    
    char a = s.charAt(k);
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) != a) {
        builder.append('*');
      } else {
        builder.append(a);
      }
    }
    
    System.out.println(builder.toString());
  }
}