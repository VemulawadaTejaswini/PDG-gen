import java.io.*;
class Main{
   public static void main(String[] args)throws java.io.IOException{
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
      String tmp = input.readLine();
      int S = Integer.parseInt(tmp);
  
      int h=0,m=0,s=0;
  
        
      s = S%60;
      m = (S/60)%60;
      h = S/3600;
  
      System.out.println(h+":"+m+":"+s);
    }
}