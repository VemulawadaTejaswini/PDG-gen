import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int S = Integer.parseInt(in.readLine());
    int W = Integer.parseInt(in.readLine());
    System.out.println(S>W?"safe":"unsafe");
  }
}