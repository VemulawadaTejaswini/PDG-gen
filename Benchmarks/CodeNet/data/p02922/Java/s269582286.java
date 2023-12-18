import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    
    int ans = 0;
    int cnt = 1;
    while(cnt<b){
      cnt-=1;
      cnt+=a;
      ans++;
    }
    
    System.out.println(ans);
  }
}