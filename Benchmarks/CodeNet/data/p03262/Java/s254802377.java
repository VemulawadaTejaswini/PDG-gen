import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

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
    int   in_X;
    int[] in_x;

    int                    cnt;
    LinkedHashSet<Integer> diff;
    ArrayList<Integer>     diff_s;
    int                    ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_N         = Integer.parseInt(in_str_split[0]);
      in_X         = Integer.parseInt(in_str_split[1]);

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_x         = new int[in_N+1];
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_x[cnt] = Integer.parseInt(in_str_split[cnt]);
      }
      in_x[in_N] = in_X;

      /*----------------
       * 計算
       *----------------*/
      Arrays.sort(in_x);

      diff = new LinkedHashSet<Integer>();
      for(cnt=1; cnt<(in_N+1); cnt++)
      {
        diff.add(in_x[cnt] - in_x[cnt-1]);
      }
      diff_s = new ArrayList<Integer>(diff);

      ans = gcd(diff_s);


      System.out.println(String.valueOf(ans));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }



  public static int gcd(int val1, int val2)
  {
    int tmp;


    if(val1 < val2)
    {
      tmp = val1;
      val1 = val2;
      val2 = tmp;
    }

    int r = -1;
    while(r != 0)
    {
      r = val1 % val2;
      val1 = val2;
      val2 = r;
    }

    return val1;
  }



  public static int gcd(ArrayList<Integer> val)
  {
    int len;
    int g;
    int cnt;


    len = val.size();

    if(1 < len)
    {
      g = gcd(val.get(0), val.get(1));

      for(cnt=1; cnt<len-1; cnt++)
      {
        g = gcd(g, val.get(cnt + 1));
      }
    }
    else
    {
      g = val.get(0);
    }

    return g;
  }



}
