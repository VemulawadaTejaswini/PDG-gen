import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

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
    StringBuffer ret = new StringBuffer();

    int count = 0;
    for (int i = bitFlag.length - 1; i >= 0; i--)
    {
      if (bitFlag[i] == '1')
      {
        ret.append((int) Math.pow(2, count));
        ret.append(" ");
      }
      count++;
    }
    return ret.toString().trim();
  }

}