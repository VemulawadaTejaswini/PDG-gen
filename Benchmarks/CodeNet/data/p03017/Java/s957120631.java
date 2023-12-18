import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int[] mas = new int[n];
    String s = sc.next();
    for(int i = 0; i < n; i++) {
      if(s.charAt(i) == '#') mas[i] = 1;
    }
    String ans = "Yes";
    int p = 0;
    for(int i = a + 1; i <= c; i++) {
      if((mas[i - 1] == 1) && (mas[i] == 1)) p++;
    }
    for(int i = b + 1; i <= d; i++) {
      if((mas[i - 1] == 1) && (mas[i] == 1)) p++;
    }
    if(c > d) {
      if(p == 0) {
        int q = 0;
        for(int i = b; i <= d; i++) {
          if((mas[i - 1] == 0) && (mas[i] == 0) && (mas[i + 1] == 0)) q++;
        }
        if(q == 0) ans = "No";
      } else {
        ans = "No";
      }
    } else {
      if(p > 0) ans = "No";
    }
    System.out.println(ans);
  }
}