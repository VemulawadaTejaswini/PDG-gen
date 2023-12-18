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

    String  in_num;
    boolean is_9;
    int     cnt;
    int     len;
    int     ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      in_num = new String(in_stream.readLine());


      ans = 0;
      len = in_num.length();

      if(1 == len)
      {
        ans = Integer.parseInt(in_num);
      }
      else
      {

        is_9 = true;
        for(cnt=1; cnt<len; cnt++)
        {
          if(!in_num.substring(cnt, cnt+1).equals("9"))
          {
            is_9 = false;
            break;
          }
        }

        if(is_9)
        {
          ans = 9 * len;;
        }
        else
        {
          ans  = 9 * (len - 1);
          ans += ( Integer.parseInt(in_num.substring(0, 1)) - 1);
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
