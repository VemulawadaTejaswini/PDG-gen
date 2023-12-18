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

    int in_A;
    int in_B;

    int   ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_A   = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_B   = Integer.parseInt(in_str);

      /*----------------
       * 計算
       *----------------*/
      ans = (in_A * in_B) - in_A - in_B + 1;

      System.out.println(String.valueOf(ans));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
