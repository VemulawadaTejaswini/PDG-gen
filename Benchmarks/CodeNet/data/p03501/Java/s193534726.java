


public class Main
{

  public static void main
  (
    String[] args
  )
  {
    int park_time;
    int pay_per_use;
    int fix_price;
    int min_price;


    park_time   = Integer.parseInt(args[0]);
    pay_per_use = Integer.parseInt(args[1]);
    fix_price   = Integer.parseInt(args[2]);

    min_price = pay_per_use * park_time;

    if(fix_price < min_price)
    {
      min_price = fix_price;
    }

    UtilLog.ans_ln(String.valueOf(min_price));
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
