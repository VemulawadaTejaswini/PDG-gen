import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main
{

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;

    int in_N;

    int                     cnt;
    HashMap<String, String> word;
    String                  last;
    boolean                 ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));
      word      = new HashMap<String, String>();

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_N   = Integer.parseInt(in_str);

      ans    = true;
      last = new String(in_stream.readLine());
      word.put(last, "a");
      for(cnt=1; cnt<in_N; cnt++)
      {
        in_str = new String(in_stream.readLine());

        if(null == word.get(in_str))
        {
          if( !(last.substring(last.length()-1, last.length()).equals(in_str.substring(0, 1))) )
          {
            ans = false;
            break;
          }

          last = in_str;
          word.put(last, "a");
        }
        else
        {
          ans = false;
          break;
        }
      }

      /*----------------
       * 計算
       *----------------*/
      if(ans)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
