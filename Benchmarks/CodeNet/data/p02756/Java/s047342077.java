import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    try{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String startc = reader.readLine();
      StringBuilder ans = new StringBuilder(startc);
      int Q = Integer.parseInt(reader.readLine());
    
      String str;
      //操作
      while((str = reader.readLine()) != null){
        String[] list = str.split(" ", 0);
        int T = Integer.parseInt(list[0]);
        if(T == 1){
          ans = ans.reverse();
        }else if(T == 2){
          int F = Integer.parseInt(list[1]);
          if(F == 1){
            ans = ans.insert(0, list[2]);
          }else if(F == 2){
            ans = ans.append(list[2]);
          }
        }
      }
      
      System.out.println(ans.toString());
    }catch(IOException e){
      System.out.println(e);
    }
    
  }
}