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

    int   in_N;
    int[] in_a;
    int[] in_b;

    int  cnt;
    int  diff;
    int  diff_cnt_a;
    int  diff_cnt_b;

    long sum_a;
    long sum_b;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_N   = Integer.parseInt(in_str);

      in_a = new int[in_N];
      in_b = new int[in_N];

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_a[cnt] = Integer.parseInt(in_str_split[cnt]);
      }

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_b[cnt] = Integer.parseInt(in_str_split[cnt]);
      }


      /*----------------
       * 処理
       *----------------*/
      diff_cnt_a = 0;
      diff_cnt_b = 0;
      sum_a      = 0;
      sum_b      = 0;
      for(cnt=0; cnt<in_N; cnt++)
      {
        diff = in_b[cnt] - in_a[cnt];

        if(0 < diff)
        {
          if(0 == (diff % 2))
          {
            diff_cnt_a += (diff / 2);
          }
          else
          {
            diff_cnt_a += (diff / 2);
            diff_cnt_b--;
          }
        }
        else if(diff < 0)
        {
          diff_cnt_b++;
        }
        else
        {
          /* Nothing to do. */
        }

        sum_a += in_a[cnt];
        sum_b += in_b[cnt];
      }

      if( (sum_b - sum_a) == (diff_cnt_a + diff_cnt_b) )
      {
        UtilLog.ans_ln("Yes");
      }
      else
      {
        UtilLog.ans_ln("No");
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}

class UtilLog
{
  private static boolean is_debug_mode = false;



  public static void ans_ln
  (
    String i_message
  )
  {
    System.out.println(i_message);
  }



  public static void ans_f
  (
    String i_message
  )
  {
    System.out.printf(i_message);
  }



  public static void inf_ln
  (
    String i_message
  )
  {
    StackTraceElement[] stack;


    if(is_debug_mode)
    {
    stack = new Throwable().getStackTrace();

    System.out.println
      (
        String.format
          (
            "[inf][%s:%s():%5d]",
            stack[1].getClassName(),
            stack[1].getMethodName(),
            stack[1].getLineNumber(),
            i_message
          )
      );
    }
  }
}
