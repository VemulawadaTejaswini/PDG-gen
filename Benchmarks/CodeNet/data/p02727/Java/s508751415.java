import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String[] S = br.readLine().split(" ");
      int X = Integer.parseInt(S[0]);
      int Y = Integer.parseInt(S[1]);
      int A = Integer.parseInt(S[2]);
      int B = Integer.parseInt(S[3]);
      int C = Integer.parseInt(S[4]);
      
      int[] max = new int[X+Y];
      int[] red = new int[A];
      int[] green = new int[B];
      int[] less = new int[C];
      
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
      Arrays.sort(less);
      
      for(int i = 0; i < X; i++){
          max[i] = red[A-i-1];
      }
      for(int i = 0; i < Y; i++){
          max[i+X] = green[B-i-1];
      }
      
      Arrays.sort(max);
      for(int i = 0; i < X+Y && i < C; i++){
          if(max[i] < less[C-i-1]){
              max[i] = less[C-i-1];
          }
      }
      long ans = 0;
      for(int i = 0; i < X+Y; i++){
          ans += max[i];
      }
      System.out.println(ans);
    }catch(Exception e){
    }
  }
}