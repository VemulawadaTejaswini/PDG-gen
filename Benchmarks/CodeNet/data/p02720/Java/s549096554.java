import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      int N = Integer.parseInt(br.readLine());
      List<Long> list = new LinkedList<>();
      for(int i = 1; i <= 9; i++){
        list.add((long)i);
      }
      
      int count = 0;
      long ans = 0;
      while(count != N){
        ans = list.remove(0);
        long mod = ans%10;
        if(mod != 0) list.add(10*ans+mod-1);
        list.add(10*ans+mod);
        if(mod != 9) list.add(10*ans+mod+1);
        count++;
      }
      
      System.out.println(ans); 
    }catch(Exception e){
    }
  }
}
