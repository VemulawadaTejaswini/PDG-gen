import java.io.*;

public class Main{
  public static void main(String[] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x;
    int i = 1;
    try{
      while((x = Integer.valueOf(br.readLine())) != 0){
        System.out.println("Case " + i + ": " + x);
        i++;
      }
    }catch (IOException e){
      System.out.println(e);
    }
  }
}