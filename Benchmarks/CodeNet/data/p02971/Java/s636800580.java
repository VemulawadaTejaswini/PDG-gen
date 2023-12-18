import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    int max = 0;
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(in.readLine());
    }
    for(int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {
        if(i!=j){
          max = Math.max(max,a[j]);
        }
      }
      System.out.println(max);
      max=0;
   }
  }
}