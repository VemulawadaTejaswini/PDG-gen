import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = new String[n];
    int[] l = new int[n];
    int[] r = new int[n];
    int sum = 0;
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      l[i] = Integer.parseInt(str[0]);
      r[i] = Integer.parseInt(str[1]);
      sum += r[i] - l[i] + 1;
    }
    System.out.println(sum);
  }
}