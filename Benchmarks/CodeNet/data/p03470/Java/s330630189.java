import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

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
    int[] in_d;

    int                cnt;
    ArrayList<Integer> kind;
    HashSet<Integer>   unique;


    try
    {
      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_N = Integer.parseInt(in_str_split[0]);

      in_d = new int[in_N];
      kind = new ArrayList<Integer>();
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_str       = new String(in_stream.readLine());
        in_str_split = in_str.split(" ");
        kind.add(Integer.valueOf(in_str_split[0]));
      }

      unique = new HashSet<Integer>(kind);


      UtilLog.ans_ln("" + unique.size());
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
