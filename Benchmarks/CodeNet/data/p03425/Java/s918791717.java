import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
  private static final int INDEX_M     = 0;
  private static final int INDEX_A     = 1;
  private static final int INDEX_R     = 2;
  private static final int INDEX_C     = 3;
  private static final int INDEX_H     = 4;
  private static final int INDEX_TOTAL = 5;

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;

    int      in_N;
    String[] in_S;

    int   cnt;
    int   cnt_1;
    int   cnt_2;
    int   cnt_3;
    int[] kind;
    long  ans;


    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_N   = Integer.parseInt(in_str);

      in_S = new String[in_N];
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_S[cnt] = new String(in_stream.readLine());
      }


      /*----------------
       * 算出
       *----------------*/
      kind = new int[INDEX_TOTAL];
      for(cnt=0; cnt<INDEX_TOTAL; cnt++)
      {
        kind[cnt] = 0;
      }

      for(cnt=0; cnt<in_N; cnt++)
      {
             if( "M".equals(in_S[cnt].substring(0, 1)) ) { kind[INDEX_M]++;     }
        else if( "A".equals(in_S[cnt].substring(0, 1)) ) { kind[INDEX_A]++;     }
        else if( "R".equals(in_S[cnt].substring(0, 1)) ) { kind[INDEX_R]++;     }
        else if( "C".equals(in_S[cnt].substring(0, 1)) ) { kind[INDEX_C]++;     }
        else if( "H".equals(in_S[cnt].substring(0, 1)) ) { kind[INDEX_H]++;     }
        else                                             { /* Nothing to do. */ }
      }

      ans = 0L;
      for(cnt_1=0; cnt_1<INDEX_TOTAL; cnt_1++)
      {
        for(cnt_2=(cnt_1+1); cnt_2<INDEX_TOTAL; cnt_2++)
        {
          for(cnt_3=(cnt_2+1); cnt_3<INDEX_TOTAL; cnt_3++)
          {
            ans += (kind[cnt_1] * kind[cnt_2] * kind[cnt_3]);
          }
        }
      }

      System.out.println("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
