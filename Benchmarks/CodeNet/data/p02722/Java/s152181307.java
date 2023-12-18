import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      long N = Long.parseLong(br.readLine());
      Set<Long> set = new HashSet<>();
      int ans = 0;
      for(int i = 2; i <= Math.sqrt(N); i++){
        if(func(N, i) == 1){
            set.add((long)i);
        }
      }
      for(int i = 1; i <= Math.sqrt(N-1); i++){
        if((N-1)%i == 0){
            set.add((long)i);
            set.add((N-1)/i);
        }
      }
      System.out.println(set.size()); 
    }catch(Exception e){
    }
  }
  static long func(long N, int i){
    if(N%i == 0){
        return func(N/i, i);
    }
    return N%i;
  }
}
