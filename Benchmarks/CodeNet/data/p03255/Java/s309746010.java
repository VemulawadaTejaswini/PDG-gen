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

    int   in_N;
    int   in_X;
    int[] in_x;

    int cnt;
    int dust_num;
    int k;
    int n;
    int ans;

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

      in_x         = new int[in_N];
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_x[cnt] = Integer.parseInt(in_str_split[cnt]);
      }


      /*----------------
       * 計算
       *----------------*/
      ans      = 0;
      dust_num = 0;

      /* 最遠から、ゴミを拾う */
      ans += in_x[in_N-1];
      ans += in_X;
      dust_num++;
      for(cnt=0; cnt<(in_N-1); cnt++)
      {
        dust_num++;
        n    = in_x[in_N-1-cnt] - in_x[in_N-2-cnt];
        k    = dust_num * dust_num;
        ans += k * n;
        ans += in_X;
      }

      /* 最近のごみから、ゴミ箱へ */
      dust_num++;
      n    = in_x[0];
      k    = dust_num * dust_num;
      ans += k * n;
      ans += in_X;

      System.out.println(String.valueOf(ans));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
