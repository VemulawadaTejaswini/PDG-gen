public class Product {
  public static void main(String[] args) {
    int a = new java.util.Scanner(System.in).nextInt();
    int b = new java.util.Scanner(System.in).nextInt();
    if ((a * b) % 2 == 0) {
      System.out.println("Even");
    } else
      System.out.println("Odd");
  }
}
