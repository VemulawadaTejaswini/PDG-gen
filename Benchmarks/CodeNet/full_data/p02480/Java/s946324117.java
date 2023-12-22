import java.io.*;

class Main {
  public static void main(String[] args) {
    BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(d.readLine());
    System.out.println(Math.pow(x,3));
  }
}