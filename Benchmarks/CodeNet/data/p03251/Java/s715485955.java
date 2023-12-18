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
    int X = Integer.parseInt(str[2]);
    int Y = Integer.parseInt(str[3]);
    int[] x = new int[n];
    int[] y = new int[m];
    
    str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      x[i] = Integer.parseInt(str[i]);
    }
    
    str = in.readLine().split(" ");
    for(int i=0; i<m; i++) {
      y[i] = Integer.parseInt(str[i]);
    }
    
    Arrays.parallelSort(x);
    Arrays.parallelSort(y);
    
    for(int i=X+1; i<Y; i++) {
      if(i>x[n-1] && i<=y[0]) {
        System.out.println("No War");
        return;
      }
    }
    
    System.out.println("War");
  }
}