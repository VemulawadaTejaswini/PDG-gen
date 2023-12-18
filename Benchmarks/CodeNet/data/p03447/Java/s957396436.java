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

    int in_X;
    int in_A;
    int in_B;
    int ans;

    try
    {

      in_stream = new BufferedReader(new InputStreamReader(System.in));

      in_str = new String(in_stream.readLine());
      in_X   = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_A  = Integer.parseInt(in_str);

      in_str = new String(in_stream.readLine());
      in_B  = Integer.parseInt(in_str);


      ans = in_X - in_A;
      ans = ans % in_B;


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
