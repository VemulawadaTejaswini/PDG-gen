import java.utul.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long sum = 0;
    //int max = 0;
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      sum += a;
      //max = Math.max(max, a);
    }
    System.out.println(sum%2 == 1 ? "first" : "second");
  }
}