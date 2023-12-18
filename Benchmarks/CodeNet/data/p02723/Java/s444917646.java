import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String S = br.readLine();
      System.out.println(S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5) ? "Yes" : "No");
    }catch(Exception e){
    }
  }
}