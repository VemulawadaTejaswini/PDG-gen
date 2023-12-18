import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] O = br.readLine().split("");
    String[] E = br.readLine().split("");
    int I;
    if (O.length > E.length) {
      I = E.length;
    } else {
      I = O.length;
    }

    String ans = "";
    for (int i = 0; i < I; i++) {
      ans += O[i] + E[i];
    }
    System.out.println(ans);
  }
}
