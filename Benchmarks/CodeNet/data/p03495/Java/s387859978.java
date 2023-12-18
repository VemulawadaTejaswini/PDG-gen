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

    String   in_number_str;
    int      in_N;
    int      in_K;
    int[]    in_A;

    int   cnt;
    int   ans;
    int[] kind_num;
    int   kind_total;

    try
    {
      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_N          = Integer.parseInt(in_str_split[0]);
      in_K          = Integer.parseInt(in_str_split[1]);

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_A = new int[in_N];
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_A[cnt] = Integer.parseInt(in_str_split[cnt]);
      }


      if(in_K < in_N)
      {
        kind_num = new int[in_N];
        for(cnt=0; cnt<in_N; cnt++)
        {
          kind_num[cnt] = 0;
        }

        for(cnt=0; cnt<in_N; cnt++)
        {
          kind_num[in_A[cnt]-1]++;
        }

        Arrays.sort(kind_num);

        ans        = 0;
        kind_total = in_N;
        for(cnt=0; cnt<in_N; cnt++)
        {
          ans += kind_num[cnt];
          kind_total--;
          if(kind_total <= in_K)
          {
            break;
          }
        }
      }
      else
      {
        ans = 0;
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
