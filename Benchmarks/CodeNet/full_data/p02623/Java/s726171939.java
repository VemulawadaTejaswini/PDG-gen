import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    long k = Long.parseLong(str[2]);
    str = in.readLine().split(" ");
    int[] a = new int[n+m];
    int count = 0;
    long sum = 0;
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
    }
    str = in.readLine().split(" ");
    for(int i=n; i<n+m; i++) {
      a[i] = Integer.parseInt(str[i-i]);
    }
    Arrays.sort(a);
    for(int i=0; i<n+m; i++) {
      sum += a[i];
      if(sum<=k)
        count+=1;
      else
        break;
    }
    System.out.println(count);
  }
}