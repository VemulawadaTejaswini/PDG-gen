import java.util.*;
import java.io.*;
 
public class Main{
  public static void main(String[]args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] S = br.readLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    int[][] val = new int[M][3];
    for(int i = 0; i < M; i++){
      String[] T = br.readLine().split(" ");
      val[i][0] = Integer.parseInt(T[0]);
      val[i][1] = Integer.parseInt(T[1]);
      val[i][2] = i;
    }
    Arrays.sort(val, (a, b) -> Integer.compare(a[1], b[1]));
    
    String[] ans = new String[M];
    int[] count = new int[N+1];
    for(int i = 0; i < M; i++){
      int a = val[i][0];
      count[a]++;
      ans[val[i][2]] = String.format("%06d%06d", a, count[a]);
    }
    
    for(int i = 0; i < M; i++){
     System.out.println(ans[i]); 
    }
  }
}
