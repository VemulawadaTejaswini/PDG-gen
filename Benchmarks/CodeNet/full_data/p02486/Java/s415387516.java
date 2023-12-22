import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true){
        String tmp = br.readLine();
        String[] nx = tmp.split(" ");  // n , x
        if (nx[0] == "0" && nx[1] == "0")
          break;
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);
        int ans = 0;
        for(int i = 1; i <= n - 2; i++){
          for (int j = i + 1; j <= n - 1; j++){
            for(int k = j + 1; k <= n; k++){
              if (i + j + k == x) ans++;
            }
          }
        }
        System.out.println(ans);
    }
  }
}