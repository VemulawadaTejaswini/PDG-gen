import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int c = Integer.parseInt(str[2]);
    str = in.readLine().split(" ");
    int[] b = new int[m];
    int[][] a = new int[n][m];
    int count = 0;
    for(int i=0; i<m; i++) {
      b[i] = Integer.parseInt(str[i]);
    }
    for(int i=0; i<n;i++) {
      str = in.readLine().split(" ");
      int sum = 0;
      for(int j=0; j<m; j++) {
        a[i][j] = Integer.parseInt(str[j]);
        sum += a[i][j] * b[j];
      }
      if(sum+c>0){
        count+=1;
        sum = 0;
      }
    } 
    System.out.println(count);
  }
}