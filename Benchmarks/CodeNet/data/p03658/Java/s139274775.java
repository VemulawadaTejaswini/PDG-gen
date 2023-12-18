import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    int[] l = new int[n];
    int sum = 0;
    str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      l[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(l);
    for(int i=n-1; i>n-1-k; i = i-1) {
      sum += l[i];
    }
    System.out.println(sum);
  }
}