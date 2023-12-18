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


    int   in_Q;
    int[] in_l;
    int[] in_r;

    int cnt;
    int ans;

    try
    {
      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_Q = Integer.parseInt(in_str_split[0]);

      in_l  = new int[in_Q];
      in_r  = new int[in_Q];
      for(cnt=0; cnt<in_Q; cnt++)
      {
        in_str       = new String(in_stream.readLine());
        in_str_split = in_str.split(" ");
        in_l[cnt]    = Integer.parseInt(in_str_split[0]);
        in_r[cnt]    = Integer.parseInt(in_str_split[1]);
      }


      for(cnt=0; cnt<in_Q; cnt++)
      {
        ans = calc(in_l[cnt], in_r[cnt]);
        UtilLog.ans_ln("" + ans);
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }



  private static int calc
  (
    int i_l,
    int i_r
  )
  {
    int ret;
    int cnt;


    ret = 0;


    /* 偶数 */
    if(i_l % 2 == 0)
    {
      for(cnt=i_l+1; cnt<=i_r; cnt+=2)
      {
        if(isPrime(cnt))
        {
          if( isPrime( (cnt + 1) / 2) )
          {
            ret++;
          }
        }
      }
    }
    /* 奇数 */
    else
    {
      for(cnt=i_l; cnt<=i_r; cnt+=2)
      {
        if(isPrime(cnt))
        {
          if( isPrime( (cnt + 1) / 2) )
          {
            ret++;
          }
        }
      }
    }

    return ret;
  }



  private static boolean isPrime
  (
    int i_num
  )
  {
    int cnt;


    if(i_num < 2)
    {
      return false;
    }
    else if(i_num == 2)
    {
      return true;
    }
    else if(i_num % 2 == 0)
    {
      /* 偶数はあらかじめ除く */
      return false;
    }

    double sqrtNum = Math.sqrt(i_num);
    for(cnt=3; cnt<=sqrtNum; cnt+=2)
    {
      if (i_num % cnt == 0)
      {
        /* 素数ではない */
        return false;
      }
    }

    /* 素数 */
    return true;
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
