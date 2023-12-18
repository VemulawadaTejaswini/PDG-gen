import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String[] S = br.readLine().split(" ");
      int A = Integer.parseInt(S[0]);
      int B = Integer.parseInt(S[1]);
      int M = Integer.parseInt(S[2]);

      String[] T = br.readLine().split(" ");
      String[] U = br.readLine().split(" ");

      int[] ref= new int[A];
      int min_ref = 100000000;
      for(int i = 0; i < A; i++){
        ref[i] = Integer.parseInt(T[i]);
        min_ref = Math.min(ref[i], min_ref);
      }

      int[] mic= new int[B];
      int min_mic = 100000000;
      for(int i = 0; i < B; i++){
        mic[i] = Integer.parseInt(U[i]);
        min_mic = Math.min(mic[i], min_mic);
      }

      int min = min_ref + min_mic;

      for(int i = 0; i < M; i++){
        S = br.readLine().split(" ");
        int X = Integer.parseInt(S[0])-1;
        int Y = Integer.parseInt(S[1])-1;
        int Z = Integer.parseInt(S[2]);
        min = Math.min(min, ref[X]+mic[Y]-Z);
      }
      System.out.println(min);
    }catch(Exception e){
    }
  }
}