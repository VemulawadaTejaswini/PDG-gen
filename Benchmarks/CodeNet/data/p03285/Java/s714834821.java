import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    boolean flg = false;
    for(int i=1; i<=25; i++) {
      if((n-i*4)%7==0 && n>=4) {
        flg = true;
        break;
      }
    }
    System.out.println(flg==true?"Yes":"No");
  }
}