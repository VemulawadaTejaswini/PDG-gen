import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] p = new int[n];
    int min = 100000*2;
    int count = 0;
    
    for(int i=0; i<n; i++) {
      p[i] = Integer.parseInt(str[i]);
      min = Math.min(p[i],min);
      if(p[i]<=min)
        count++;
    }

    System.out.println(count);
  }
}