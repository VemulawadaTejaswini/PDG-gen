import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String[] S = br.readLine().split(" ");
      int N = Integer.parseInt(S[0]);
      int M = Integer.parseInt(S[1]);
      int sum = 0;
      S = br.readLine().split(" ");
      for(int i = 0; i < M; i++){
        sum += Integer.parseInt(S[i]);
      }
      int ans = N-sum;
      System.out.println(ans < 0 ? -1 : ans);
    }catch(Exception e){
      System.out.println(e.toString());
    }
  }
}