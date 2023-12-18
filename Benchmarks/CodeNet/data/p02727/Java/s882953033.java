import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String[] S = br.readLine().split(" ");
      int X = Integer.parseInt(S[0]);
      int Y = Integer.parseInt(S[1]);
      int Z = X+Y;
      int A = Integer.parseInt(S[2]);
      int B = Integer.parseInt(S[3]);
      int C = Integer.parseInt(S[4]);
      
      int[] red = new int[A];
      int[] green = new int[B];
      int[] less = new int[C+Z];
      
      S = br.readLine().split(" ");
      for(int i = 0; i < A; i++){
          red[i] = Integer.parseInt(S[i]);
      }
      
      S = br.readLine().split(" ");
      for(int i = 0; i < B; i++){
          green[i] = Integer.parseInt(S[i]);
      }
      
      S = br.readLine().split(" ");
      for(int i = 0; i < C; i++){
          less[i] = Integer.parseInt(S[i]);
      }
      
      Arrays.sort(red);
      Arrays.sort(green);
      
      for(int i = 0; i < X; i++){
          less[C+i] = red[A-i-1];
      }
      for(int i = 0; i < Y; i++){
          less[i+X+C] = green[B-i-1];
      }
      Arrays.sort(less);
      
      long ans = 0;
      for(int i = 1; i <= Z; i++){
        ans += less[C+Z-i];
      }
      System.out.println(ans);
    }catch(Exception e){
    }
  }
}
