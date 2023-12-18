import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int t = Integer.parseInt(str[0]);
    int a = Integer.parseInt(str[1]);
    String[] h_str = in.readLine().split(" ");
    int[] h = new int[n];
    int min = 100000;
    int ans = 100000;
    
    for(int i=0; i<n; i++) {
      h[i] = Integer.parseInt(h_str[i]);
      double temp = t - (double)h[i]*0.006;
      if(Math.min((int)Math.abs(temp-a),min)!=min) {
        min = Math.abs((int)temp-a);
        ans = i+1;
      }
    }
    System.out.println(ans);
  }
}