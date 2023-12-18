import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] arg) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    for(int i=n; i>0; i=i-1) {
      if(Math.sqrt(i)==(int)Math.sqrt(i)) {
        System.out.println(i);
        break;
      }
    }
  }
}
   