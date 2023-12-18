import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int k = Integer.parseInt(in.readLine());
    int[] x = new int[n];
    String[] str = in.readLine().split(" ");
    int sum = 0;
    for(int i=0; i<n; i++) {
      x[i] = Integer.parseInt(str[i]);
      int a_sum = x[i]*2;
      int b_sum = (k-x[i])*2;
      sum += Math.min(a_sum,b_sum);
    }
    System.out.println(sum);
  }
}