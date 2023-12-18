import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n-1];
    String[] str = in.readLine().split(" ");
    int[] ans = new int[n-1];

    for(int i=0; i<=n-2; i++) {
      ans[i] = 0;
    }
    for(int i=0; i<=n-2; i++) {
      a[i] = Integer.parseInt(str[i]);
      for(int j=1; j<=n-1; j++) {
        if(j==a[i]){
          ans[j-1] += 1;
        }
      }
    }
    for(int i=0; i<n-1; i++) {
      System.out.println(ans[i]);
    }
    System.out.println(0);
  }
}
    