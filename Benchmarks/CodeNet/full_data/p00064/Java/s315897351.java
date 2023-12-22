import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws NumberFormatException, IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int ans = 0;

    while (input.ready())
    {
      String INPUT_STR = input.readLine();
      ans += getSeacretNumber(INPUT_STR);
    }
    System.out.println(ans);
  }

  private static int getSeacretNumber(String str)
  {
    char[] charArray = str.toCharArray();
    String numString = "";
    int ans = 0;

    for (char c : charArray)
    {
      if (isNumberChar(c))
      {
        numString += String.valueOf(c);
      }
      else
      {
        if (numString.length() > 0)
        {
          ans += Integer.valueOf(numString);
          numString = "";
        }
      }
    }
    if (numString.length() > 0)
    {
      ans += Integer.valueOf(numString);
    }
    return ans;
  }

  private static boolean isNumberChar(char c)
  {
    if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
        || c == '8' || c == '9')
    {
      return true;
    }
    return false;
  }
}