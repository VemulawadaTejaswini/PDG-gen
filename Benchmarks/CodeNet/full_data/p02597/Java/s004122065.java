import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String c_str = in.readLine();
    String c_half = c_str.substring(0,c_str.length()/2);
    String[] c_half_ary = c_half.split("");
    int count = 0;
    for(int i=0; i<n/2; i++) {
      if(c_half_ary[i].equals("W"))
        count++;
    }
    System.out.println(count);
  }
}