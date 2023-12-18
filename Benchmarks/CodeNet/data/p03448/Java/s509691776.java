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
    int in_C;
    int in_X;

    int cnt_50;
    int cnt_100;
    int cnt_500;

    int tmp_num;
    int ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      in_str = new String(in_stream.readLine());
      in_A  = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_B  = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_C  = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_X   = Integer.parseInt(in_str);


      ans = 0;

      for(cnt_500=0; cnt_500<=in_A; cnt_500++)
      {
        for(cnt_100=0; cnt_100<=in_B; cnt_100++)
        {
          for(cnt_50=0; cnt_50<=in_C; cnt_50++)
          {
            tmp_num = (500 * cnt_500) + (100 * cnt_100) + (50 * cnt_50);
            if(in_X == tmp_num)
            {
              ans ++;
              break;
            }
            else if(in_X < tmp_num)
            {
              break;
            }
            else
            {
              /* Nothing to do. */
            }
          }
        }
      }

      UtilLog.ans_ln("" + ans);
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
