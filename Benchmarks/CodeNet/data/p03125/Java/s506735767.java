import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]);
    
    if (B % A == 0) {
      System.out.println(A + B);
    } else {
      System.out.println(B - A);
    }
  }
}