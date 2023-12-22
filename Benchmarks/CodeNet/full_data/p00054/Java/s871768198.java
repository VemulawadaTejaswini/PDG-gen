import java.util.*;

class Main {
  void run() {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int n = sc.nextInt();
      int s = 0;
      if (a>b) a = a%b;
      for (int i=0;i<n;i++) {
          a *= 10;
          s += (a-b/2)/b;
          a = a%b;
      }
      System.out.println(s);
    }
  }
  public static void main(String[] args) {
    new Main().run();
  }
}