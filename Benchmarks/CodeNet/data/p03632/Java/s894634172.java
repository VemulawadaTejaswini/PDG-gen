import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private static Scanner sc = new Scanner(System.in);

  private void run() {
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();

    int ans = Math.min(B, D) - Math.max(A, C);
    System.out.println(Math.max(ans, 0));
  }
}
