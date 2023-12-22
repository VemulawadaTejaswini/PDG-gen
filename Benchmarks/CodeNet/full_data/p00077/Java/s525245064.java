import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    while (input.ready())
    {
      System.out.println(decoder(input.readLine()));
    }
  }

  private static String decoder(String str)
  {
    return decoder(str.toCharArray());
  }

  private static String decoder(char[] charArray)
  {
    String ret = "";
    for (int i = 0; i < charArray.length; i++)
    {
      if (charArray[i] == '@')
      {
        final int COUNT = Integer.valueOf(String.valueOf(charArray[i + 1]));
        for (int j = 0; j < COUNT; j++)
        {
          ret += charArray[i + 2];
        }
        i += 2;
        continue;
      }
      ret += charArray[i];
    }
    return ret;
  }
}