import java.util.*;
public class Main {
  public static void main(String[] args){
     new Main().run();
  }

  void run() {
    Scanner sc = new Scanner(System.in);
    long limit = (long)Math.pow(10, 18);
    long N = sc.nextLong();
    long ans = sc.nextLong();

    long i;
    for (i=1; i<N; i++) {
      ans *= sc.nextLong();
      if (limit < ans) {
        ans = -1;
        i++;
        break;
      }
    }
    if (ans == -1) {
      for (; i<N; i++) {
        if (sc.nextLong() == 0) {
          ans = 0;
        }
      }
    }

    System.out.println(ans);
  }
}
