import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

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

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      if("1".equals(in_str))
      {
        System.out.println("Hello World");
      }
      else
      {
        in_str = new String(in_stream.readLine());
        in_A   = Integer.parseInt(in_str);
        in_str = new String(in_stream.readLine());
        in_B   = Integer.parseInt(in_str);

        System.out.println(String.valueOf(in_A + in_B));
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
