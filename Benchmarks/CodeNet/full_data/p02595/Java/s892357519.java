public class Main {
  public static void main(String[] args) {
    int N = new java.util.Scanner(System.in).nextInt();
    int D = new java.util.Scanner(System.in).nextInt();
    int counts = 0;
    for (int i = 1; i < N + 1; i++) {
      int X_i = new java.util.Scanner(System.in).nextInt();
      int Y_i = new java.util.Scanner(System.in).nextInt();
      double A = Math.sqrt(X_i * X_i + Y_i * Y_i);
      if (A <= D) {
        counts = counts++;
      }
      System.out.println(counts);
    }
  }
}
