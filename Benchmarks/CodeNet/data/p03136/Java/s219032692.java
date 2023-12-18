import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] l = new int[n];
    int l_max = 0;
    int l_sum = 0;
    
    for(int i=0; i<n; i++) {
      l[i] = Integer.parseInt(str[i]);
      l_max = Math.max(l_max,l[i]);
      l_sum += l[i];
    }
    if(l_sum-l_max>l_max)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}