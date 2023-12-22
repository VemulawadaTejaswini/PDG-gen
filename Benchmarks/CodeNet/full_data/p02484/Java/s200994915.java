import java.io.*;

class Main {
  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out);
    for (int i = 0; i < 1000; i++) {
      out.println("Hello World");
    }
    out.flush();
  }
}