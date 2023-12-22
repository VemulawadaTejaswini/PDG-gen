/* Volume0 */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      for(int i = 1; i <= 9; i++){
        for(int j = 1; j <= 9; j++){
          sb.append(i).append("x").append(j).append("=").append(i * j);
          sb.append("\n");
        }
      }

      System.out.print(sb);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}