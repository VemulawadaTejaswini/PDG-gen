import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main {
  public static void main (String[] args) throws IOException {
    StringBuilder sb  = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt( br.readLine());
    int x = 0;
for(int i = 1; i <= n; i++){
    if(i % 3 == 0) {
      sb.append(" ");
      sb.append(i);
    } else {
      x = i;
     while(x != 0){
      if(x % 10 == 3) {
        sb.append(" ");
        sb.append(i);
        break;
    } else {
      x /= 10;
    }
     }
    }
   }
   sb.append("\n");
   System.out.print(sb);
  }
}
