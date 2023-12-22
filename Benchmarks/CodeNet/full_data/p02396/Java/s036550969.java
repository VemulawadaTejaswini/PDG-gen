public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (true) {
      int x = new java.util.Scanner(System.in).nextInt();
      i++;
      System.out.println("Case "+ i + ": " + x);
      if (x == 0) break;
    }
  }
}