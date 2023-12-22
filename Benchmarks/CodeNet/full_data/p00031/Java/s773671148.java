import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main
{

  final static int[] WEIGHT =
  { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };

  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      final int num = Integer.parseInt(input.readLine());

      System.out.println(solver(num));
    }

  }

  private static String solver(int num)
  {
    final char[] bitFlag = Integer.toBinaryString(num).toCharArray();
    StringBuilder ret = new StringBuilder();

    int count = 0;
    for (int i = bitFlag.length - 1; i >= 0; i--)
    {
      if (bitFlag[i] == '1')
      {
        ret.append(WEIGHT[count]);
        ret.append(" ");
      }
      count++;
    }
    return ret.toString().trim();
  }

}