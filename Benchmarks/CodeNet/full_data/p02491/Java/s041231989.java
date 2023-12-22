import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);

    try {
      while (true) {
        int a = in.nextInt();
        int b = in.nextInt();
        out.printf("%d %d %.5f\n", a / b, a % b, (float)a / b);
      }
    }

    catch (NoSuchElementException e) {}

    finally {
      out.flush();
    }
  }
}