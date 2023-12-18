import java.util.*;
import java.io.*;

public class Main{

  public static boolean query(long[] h, long A, long B, long T){
    long need = 0;
    for(int i=0;i<h.length;i++){
      need += -Math.floorDiv(-h[i]+B*T, A-B);
    }
    return need <= T;
  }

  public static void main(String[] args) {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
      String[] sArr = in.readLine().split(" ");
      int N = Integer.parseInt(sArr[0]);
      long A = Long.parseLong(sArr[1]);
      long B = Long.parseLong(sArr[2]);
      long[] h = new long[N];

      for(int i=0;i<N;i++){
        h[i] = Long.parseLong(in.readLine());
      }

      long t = (long)Math.pow(10, 9)/2;
      long a = (long)Math.pow(10, 9)/4;
      long trueMin=Long.MAX_VALUE;
      long falseMax=Long.MIN_VALUE;
      while(true){
        if(query(h, A, B, t)){
          trueMin = t;
          t -= a;
        }else{
          falseMax = t;
          t += a;
        }
        a /= 2;
        a = a == 0 ? 1 : a;
        if(trueMin == falseMax + 1 || trueMin == 0){
          break;
        }
      }

      System.out.println(trueMin);

    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
