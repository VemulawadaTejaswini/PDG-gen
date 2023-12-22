/* Volume0 */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      for(int i = 1; i <= 9; i++){
        for(int j = 1; j <= 9; j++){
          System.out.println(i + "x" + j + "=" +  i*j);
        }
      }
    }catch(Exception e){
      System.out.println(e);
    }
  }
}