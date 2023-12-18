import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

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

    int        in_H;
    int        in_W;
    String[][] in_a;

    int     cnt_h;
    int     cnt_w;
    boolean not_skip_h[];
    boolean not_skip_w[];
    int     ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_H         = Integer.parseInt(in_str_split[0]);
      in_W         = Integer.parseInt(in_str_split[1]);


      in_a       = new String[in_H][in_W];
      not_skip_h = new boolean[in_H]; /* init value = false(スキップあり) */
      not_skip_w = new boolean[in_W]; /* init value = false(スキップあり) */

      for(cnt_h=0; cnt_h<in_H; cnt_h++)
      {
        in_str = new String(in_stream.readLine());
        for(cnt_w=0; cnt_w<in_W; cnt_w++)
        {
          in_a[cnt_h][cnt_w] = in_str.substring(cnt_w, cnt_w+1);

          if("#".equals(in_a[cnt_h][cnt_w]))
          {
            not_skip_h[cnt_h] = true; /* スキップなしに設定 */
            not_skip_w[cnt_w] = true; /* スキップなしに設定 */
          }
        }
      }

      /*----------------
       * 出力
       *----------------*/
      for(cnt_h=0; cnt_h<in_H; cnt_h++)
      {
        if(not_skip_h[cnt_h])
        {
          for(cnt_w=0; cnt_w<in_W; cnt_w++)
          {
            if(not_skip_w[cnt_w])
            {
              System.out.print(in_a[cnt_h][cnt_w]);
            }
          }
          System.out.print("\n");
        }
      }

    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
