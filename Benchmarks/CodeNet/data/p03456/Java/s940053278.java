import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int num = Integer.parseInt(str[0] + str[1]);
    boolean sqrRootFlg = false;
    for(int i=1; i<=1000; i++) {
      if(Math.sqrt(num)==i) {
        sqrRootFlg = true;
        break;
      }
    }
    System.out.println(sqrRootFlg==true?"Yes":"No");
  }
}