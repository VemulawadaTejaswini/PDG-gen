import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] sa = br.readLine().split(" ");
    int n = Integer.parseInt(sa[0]); // 長さ
    String s = (sa[1]); // 文字列
    br.close();

    int count = 0;
    int size = n;
    for (int i = 0; i < size; i++) {

      if (size - i >= 3) {
        String tmp = s.substring(i, i + 3);

        if ("ABC".equals(tmp)) {
          count++;
        }
      } else {
        break;
      }
    }
    System.out.println(count);
  }
}