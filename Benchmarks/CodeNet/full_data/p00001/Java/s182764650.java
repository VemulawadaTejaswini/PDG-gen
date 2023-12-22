/* Volume1 */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int h1 = 0,h2 = 0,h3 = 0;

      for(int i = 0; i < 10; i++){
        int height = Integer.parseInt(br.readLine());
        if(h1 < height){
          h3 = h2;
          h2 = h1;
          h1 = height;
        }else if(h2 < height){
          h3 = h2;
          h2 = height;
        }else if(h3 < height){
          h3 = height;
        }
      }

      sb.append(h1).append("\n");
      sb.append(h2).append("\n");
      sb.append(h3).append("\n");

      System.out.print(sb);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}