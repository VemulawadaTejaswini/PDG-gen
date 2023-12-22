import java.io.*;

class Main {
  public static void Main(String[] args) {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      double x = readDouble(in);
      System.out.println(Math.pow(x,3));
  }
}