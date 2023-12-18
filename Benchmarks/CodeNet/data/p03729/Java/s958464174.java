import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    boolean flg = true;
    if(!(str[0].substring(str[0].length()-1,str[0].length()).equals(str[1].substring(0,1)))
      ||
      !(str[1].substring(str[1].length()-1,str[1].length()).equals(str[2].substring(0,1))))
      flg = false;
    System.out.println(flg == true?"YES":"NO");
  }
}