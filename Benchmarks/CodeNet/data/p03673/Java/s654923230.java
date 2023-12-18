import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str1 = br.readLine();
    String str2 = br.readLine();

    int length = Integer.parseInt(str1);
    StringTokenizer st = new StringTokenizer(str2);

    String num[] = new String[length];

    for (int i = 0; i < length; i++) {
      num[i] = st.nextToken();
    }

    if (length == 1) {
      System.out.println(num[0]);
    } else {
      String b = "";
      for (int i = 0; i < length; i++) {
        b += num[i];
        b = new StringBuffer(b).reverse().toString();
        b += " ";
      }

      System.out.println(b);
    }

  }

}
