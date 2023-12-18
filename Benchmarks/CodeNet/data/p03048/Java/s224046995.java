import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = Integer.parseInt(sc.next());
    int g = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int n = Integer.parseInt(sc.next());

    int res = 0;
    int total = 0;
    
    for (int x = 0; x <= n/r; x++) {
      if (r*x <= n ){
        for (int y = 0; y <= n/g; y++) {
          if (r*x+g*y <= n) {
            for (int z = 0; z <= n/b; z++) {
              total = r*x + g*y + b*z;
              if (total == n) res++;
              total = 0;
            }
          }
        }
      }
    }
    
    System.out.println(res);
  }
}
