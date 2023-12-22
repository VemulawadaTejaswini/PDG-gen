public class Main {
  public static void main(String[] args) {
    int S = new java.util.Scanner(System.in).nextInt();
    int W = new java.util.Scanner(System.in).nextInt();
    if (S >= W) {
      System.out.println("unsafe");
    } else {
      System.out.println("safe");
    }
  }
}
