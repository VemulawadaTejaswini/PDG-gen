import java.io.BufferedReader;
import java.io.InputStreamReader;




@SuppressWarnings({"javadoc"})
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

    int    in_H1;
    int    in_M1;
    int    in_H2;
    int    in_M2;
    int    in_K;
    int    in_index;

    int tmp;


    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_index = 0;
      in_H1    = Integer.parseInt(in_str_split[in_index++]);
      in_M1    = Integer.parseInt(in_str_split[in_index++]);
      in_H2    = Integer.parseInt(in_str_split[in_index++]);
      in_M2    = Integer.parseInt(in_str_split[in_index++]);
      in_K     = Integer.parseInt(in_str_split[in_index++]);


      /*----------------
       * 計算
       *----------------*/
      tmp = (in_H2 * 60) + in_M2 - in_K - ((in_H1 * 60) - in_M1);

      System.out.println(String.valueOf(tmp));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }



}



