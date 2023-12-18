import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i, ret, x, ans;
    int[] cre = {-1, 1};
    int N = Integer.parseInt(br.readLine());
    String[] array = br.readLine().split("");
    x = ans = 0;
    for (String Si: array) {
      ret = Si.equals("I") ? 1 : 0;
      x += cre[ret];
      ans = Math.max(x, ans);
    }
    System.out.println(ans);
  }
}
