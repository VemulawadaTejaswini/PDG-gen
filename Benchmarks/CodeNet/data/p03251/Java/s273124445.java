import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int x = Integer.parseInt(str[2]);
    int y = Integer.parseInt(str[3]);
    
    int[] x_ary = new int[n];
    int x_max = 0;
    str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      x_ary[i] = Integer.parseInt(str[i]);
      x_max = Math.max(x_ary[i],x_max);
    }
        
    int[] y_ary = new int[m];
    int y_min = 100;
    str = in.readLine().split(" ");
    for(int i=0; i<m; i++) {
      y_ary[i] = Integer.parseInt(str[i]);
      y_min = Math.min(y_ary[i],y_min);
    }
    
    if(x_max < y_min && y_min <= y && x_max >= x)
      System.out.println("No War");
    else
      System.out.println("War");
  }
}

