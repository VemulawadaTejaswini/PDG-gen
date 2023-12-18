import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{


  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;
    String[]       in_str_split;

    int in_A;
    int in_B;
    int in_C;
    int in_D;

    int ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_A = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_B = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_C = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_D = Integer.parseInt(in_str);


      /*----------------
       * 計算
       *----------------*/
      ans = 0;
      if(in_A <= in_B)
      {
        ans += in_A;
      }
      else
      {
        ans += in_B;
      }

      if(in_C <= in_D)
      {
        ans += in_C;
      }
      else
      {
        ans += in_D;
      }

      System.out.println("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

}
