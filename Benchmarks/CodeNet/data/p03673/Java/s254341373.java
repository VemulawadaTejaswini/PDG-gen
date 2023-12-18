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
    for (int i = 0; i < num.length; i++) {
      num[i] = st.nextToken();
    }

    if ((num.length % 2) == 0) {
      for (int i = 0; i < num.length / 2; i++) {
        System.out.print(num[length - 1 - i] + " ");
        System.out.print(num[i]);
        if (i + 1 < num.length / 2) {
          System.out.print(" ");
        }
      }
    } else {
      int cnt = 0;
      for (int i = 0; i < num.length / 2; i++) {
        System.out.print(num[i] + " ");
        System.out.print(num[length - 1 - i] + " ");
        cnt++;
      }
      System.out.print(num[cnt]);
    }
    
  }

}
