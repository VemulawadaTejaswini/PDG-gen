import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main {
  private static BufferedReader buf;
  public static void main(String[] args) throws IOException {
    buf = new BufferedReader(new InputStreamReader(System.in));
    String str = buf.readLine();
    String[] s = str.split(" ", 0);
    int W = Integer.parseInt(s[0]);
    int H = Integer.parseInt(s[1]);
    int x = Integer.parseInt(s[2]);
    int y = Integer.parseInt(s[3]);
    int r = Integer.parseInt(s[4]);
    if ((y+r<=H)&&(y-r>=0)&&(x+r<=W)&&(x-r>=0)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}