import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    int x;
    String e, str;
    int card[] = new int[52];
    for (int i = 0; i < 52; i++) {
      card[i] = 0;
    }
    int n = Integer.parseInt(buf.readLine());
    for (int i = 0;i < n; i++) {
      str = buf.readLine();
      e = str.split(" ", 0)[0];
      x = Integer.parseInt(str.split(" ", 0)[1]);
      if (e == "S") {
        card[x-1] = 1;
      } else if (e == "H") {
        card[x-14] = 1;
      } else if (e == "C") {
        card[x-27] = 1;
      } else {
        card[x-40] = 1;
      }
    }
  }
}