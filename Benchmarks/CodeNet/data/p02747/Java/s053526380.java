import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String S = br.readLine();
      String hi = "";
      boolean f = false;
      for(int i = 0; i < S.length()/2; i++){
        hi += "hi";
        f = f || hi.equals(S);
      }
      System.out.println(f ? "Yes" : "No");
    }catch(Exception e){
    }
  }
}