import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args){
    try{
      InputStreamReader is = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(is);
      String[] sp = br.readLine().split(" ");
      int N = Integer.parseInt(sp[0]);
      int M = Integer.parseInt(sp[1]);
      sp = br.readLine().split(" ");
      
      int now = 0;
      long[] amaris = new long[N];
      for(int i=0;i<N;i++){
        now=(now+Long.parseLong(sp[i]))%M;
        amaris[now]++;
      }
      long patterns = 0;
      for(int i=0;i<N;i++){
        patterns += (amaris[i]*(amaris[i]-1))/2;
      }
      System.out.println(patterns);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}