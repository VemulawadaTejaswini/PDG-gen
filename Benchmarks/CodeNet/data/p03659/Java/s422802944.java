import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] an = new int[n];
    String[] data = br.readLine().split(" ");
    
    for (int i=0; i<n; i++){
      an[i] = Integer.parseInt(data[i]);
    }
    long[] results = new long[n-1];
    long temp = 0;
    long sum = Arrays.stream(an).sum();
    for (int i=0; i<n-1; i++){
      temp += an[i];
      results[i] = Math.abs(sum-temp-temp);
    }
    System.out.println(Arrays.stream(results).min().getAsLong());
  }
}
