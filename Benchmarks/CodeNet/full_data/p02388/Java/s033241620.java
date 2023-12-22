import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    int x = System.in.read();
    if (1 <= x && x <= 100) {
      System.out.println(cubic(x));
    }
  }

  private static int cubic(int x) {
    return x * x * x;
  }
}