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
      String[] dataStr = input.readLine().split(" ");
      int[] dataInt = new int[dataStr.length];
      for (int i = 0; i < dataStr.length; i++)
      {
        dataInt[i] = Integer.valueOf(dataStr[i]);
      }
      System.out.println(getGCD(dataInt[0], dataInt[1]) + " " + getLCM(dataInt[0], dataInt[1]));
    }
  }

  public static int getGCD(int num1, int num2)
  {
    if (num1 == num2)
      return num1;

    int a  = Math.max(num1, num2);
    int b = Math.min(num1, num2);
    int c = 1;

    while (true)
    {
      c = a % b;
      if(c == 0) {
        break;
      }
      a = b;
      b = c;
    }
    return b;
  }

  public static int getLCM(int a, int b)
  {
    int productA = a;
    int productB = b;
    while (productA <= 2000000000)
    {
      if (productA == productB)
      {
        return productA;
      }
      if (productA < productB)
      {
        productA += a;
      }
      else
      {
        productB += b;
      }
    }
    return 0;
  }
}