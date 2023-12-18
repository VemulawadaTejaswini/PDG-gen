import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    int[] ans = new int[n];
    String[] str = in.readLine().split(" ");
    for(int i = 0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
      for(int j=1; j<=n; j++) {
        if(a[i]==j)
          ans[j-1] = i+1;
      }
    }
    for(int i=0; i<n; i++){
      System.out.print(ans[i] + " ");
    }
  }
}