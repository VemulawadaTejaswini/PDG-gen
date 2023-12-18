import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int N = Integer.parseInt(n);
    int s = 0;
    for(int i = 0; i < n.length(); i++) {
      int a = Integer.parseInt(String.valueOf(n.charAt(i)));
      s += a;
    }
    String ans = "No";
    if(N % s == 0) ans = "Yes";
    System.out.println(ans);
  }
}
