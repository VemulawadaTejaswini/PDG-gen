import java.io.*;

class Main {
  public static void Main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      double x = readDouble(in);
      System.out.println(Math.pow(x,3));
     } catch (EOFException e) {
      return;
     } catch (IOException e) {
      System.err.println("入出力に関する例外が発生しました。");
  }
}