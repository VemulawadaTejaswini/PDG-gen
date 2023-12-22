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

    for (long i=1; i<N; i++) {
      ans *= sc.nextLong();
    }
    if (limit < ans) {
      ans = -1;
    }

    System.out.println(ans);
  }
}
