import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for(int i = 1;i < (input + 1);i++) {
      if(i % 3 == 0) {
        sb.append(" " + Integer.toString(i));
      }
      else if(i % 10 == 3) {
        sb.append(" " + Integer.toString(i));
      }
    }
    System.out.println(sb);
  }
}