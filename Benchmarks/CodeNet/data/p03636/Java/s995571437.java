import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String s = new String(in.readLine());
      String[] ar = s.split("");
      int a = ar.length;
      int b = a - 2;
      System.out.println(ar[0] + b + ar[a-1]);
    }
}