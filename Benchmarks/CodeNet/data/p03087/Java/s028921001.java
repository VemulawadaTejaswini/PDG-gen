import java.util.*;

class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    for (int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      String lr = s.substring(l - 1, r);
      int ans = 0;
      while (true) {
        int index = lr.indexOf("AC");
        if (index == -1) {
          System.out.println(ans);
          break;
        }
        ans++;
        lr = lr.substring(index + 2);
      }
    }
  }
}