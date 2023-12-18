import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String strs[] = br.readLine().split(" ");
    String s = br.readLine();
    int N = Integer.parseInt(strs[0]), Q = Integer.parseInt(strs[1]);
    int count = 0;
    
    for (int i = 0; i < Q; i++) {
      String[] str = br.readLine().split(" ");
      int start = Integer.parseInt(str[0]);
      int end = Integer.parseInt(str[1]);
      for (int j = start-1; j < end-1; j++) {
        String tmp = s.substring(j, j+2);
        if ("AC".equals(tmp)) {
          count++;
        }
      }
      System.out.println(count);
      count = 0;
    }
  }
}