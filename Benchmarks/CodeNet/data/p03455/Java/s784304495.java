public class Main {
  public static void main(String[] args) {
    int a = new java.util.Scanner(System.in).nextInt();
    int b = new java.util.Scanner(System.in).nextInt();
    if ((a * b) % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}
