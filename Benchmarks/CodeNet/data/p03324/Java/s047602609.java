import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int D = Integer.parseInt(sc.next());
    int N = Integer.parseInt(sc.next());

    int ans = (int) Math.pow(100, D) * N;

    if (N == 100) {
      ans++;
    }
    System.out.println(ans);
  }
}