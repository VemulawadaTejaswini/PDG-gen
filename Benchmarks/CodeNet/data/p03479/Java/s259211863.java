import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

    long in_X;
    long in_Y;

    long cnt;
    long ans;
    long next;


    try
    {
      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_X = Long.parseLong(in_str_split[0]);
      in_Y = Long.parseLong(in_str_split[1]);

      next = in_X;
      ans  = 0;
      for(cnt=1; next<=in_Y; cnt++)
      {
        ans++;
        next = in_X * ( (long)Math.pow(2, cnt) );
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
