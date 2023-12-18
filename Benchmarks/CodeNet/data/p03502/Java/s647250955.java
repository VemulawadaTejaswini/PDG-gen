import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    int n = Integer.parseInt(str);
    String[] ary = str.split("");
    int sum = 0;
    for(int i=0; i<str.length(); i++) {
      sum += Integer.parseInt(ary[i]);
    }
    System.out.println(n%sum==0?"Yes":"No");
  }
}