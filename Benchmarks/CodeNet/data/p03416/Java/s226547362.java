import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

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

    int cnt;
    int ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_A   = Integer.parseInt(in_str_split[0]);
      in_B   = Integer.parseInt(in_str_split[1]);


      ans = 0;
      for(cnt=in_A; cnt<=in_B; cnt++)
      {
        if( String.valueOf(cnt).substring(0, 2).equals(String.valueOf(cnt).substring(3, 5)) )
        {
          ans++;
        }
      }


      System.out.println("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
