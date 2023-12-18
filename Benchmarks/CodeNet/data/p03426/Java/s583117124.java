import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main
{
  static class Data
  {
    public int v;
    public int i;
    public int j;

    public Data
    (
      int v,
      int i,
      int j
    )
    {
      this.v = v;
      this.i = i;
      this.j = j;
    }
  }

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;
    String[]       in_str_split;

    int                    in_H;
    int                    in_W;
    int                    in_D;
    HashMap<Integer, Data> in_A;
    int                    in_Q;
    int[]                  in_L;
    int[]                  in_R;

    int cnt_h;
    int cnt_w;
    int cnt_q;

    int tmp;
    int now;
    int goal;
    Data now_data;
    Data next_data;
    int ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_H   = Integer.parseInt(in_str_split[0]);
      in_W   = Integer.parseInt(in_str_split[1]);
      in_D   = Integer.parseInt(in_str_split[2]);

      in_A = new HashMap<Integer, Data>();
      for(cnt_h=0; cnt_h<in_H; cnt_h++)
      {
        in_str       = new String(in_stream.readLine());
        in_str_split = in_str.split(" ");

        for(cnt_w=0; cnt_w<in_W; cnt_w++)
        {
          tmp = Integer.parseInt(in_str_split[cnt_w]);
          in_A.put(tmp, new Data(tmp, cnt_h, cnt_w));
        }
      }

      in_str = new String(in_stream.readLine());
      in_Q   = Integer.parseInt(in_str);

      in_L = new int[in_Q];
      in_R = new int[in_Q];
      for(cnt_q=0; cnt_q<in_Q; cnt_q++)
      {
        in_str       = new String(in_stream.readLine());
        in_str_split = in_str.split(" ");

        in_L[cnt_q] = Integer.parseInt(in_str_split[0]);
        in_R[cnt_q] = Integer.parseInt(in_str_split[1]);
      }


      /*----------------
       * 計算
       *----------------*/
      for(cnt_q=0; cnt_q<in_Q; cnt_q++)
      {
        ans = 0;

        now  = in_L[cnt_q];
        goal = in_R[cnt_q];

        now_data = in_A.get(now);
        while(goal != now_data.v)
        {
          next_data = in_A.get(now_data.v + in_D);
          ans += Math.abs(next_data.i - now_data.i) + Math.abs(next_data.j - now_data.j);

          now_data = next_data;
        }

        System.out.println("" + ans);
      }

    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
