/* ITP1_5_A */
import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str[] = br.readLine().split(" ");

    int height = Integer.parseInt(str[0]);
    int width = Integer.parseInt(str[1]);

    for(int i = 0; i < height; i++){
      for(int j = 0; j < width; j++){
        System.out.print("#");
      }
      System.out.println("");
    }
    System.out.println("");
  }
}