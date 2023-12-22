import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while (input.ready())
    {
      final String[] inputStr = input.readLine().split(" ");
      final double ans = getAns(inputStr);
      System.out.println(ans);
    }
  }

  private static double getAns(String[] input)
  {
    Deque<String> stack = new ArrayDeque<>();
    for (String s : input)
    {
      if (s.equals("+"))
      {
        double b = Double.parseDouble(stack.removeFirst());
        double a = Double.parseDouble(stack.removeFirst());
        stack.addFirst(String.valueOf(addition(a, b)));
        continue;
      }
      if (s.equals("-"))
      {
        double b = Double.parseDouble(stack.removeFirst());
        double a = Double.parseDouble(stack.removeFirst());
        stack.addFirst(String.valueOf(subtraction(a, b)));
        continue;
      }
      if (s.equals("*"))
      {
        double b = Double.parseDouble(stack.removeFirst());
        double a = Double.parseDouble(stack.removeFirst());
        stack.addFirst(String.valueOf(multiplication(a, b)));
        continue;
      }
      if (s.equals("/"))
      {
        double b = Double.parseDouble(stack.removeFirst());
        double a = Double.parseDouble(stack.removeFirst());
        stack.addFirst(String.valueOf(division(a, b)));
        continue;
      }
      stack.addFirst(s);
    }
    return Double.parseDouble(stack.removeFirst());
  }

  private static double addition(double a, double b)
  {
    return a + b;
  }

  private static double subtraction(double a, double b)
  {
    return a - b;
  }

  private static double multiplication(double a, double b)
  {
    return a * b;
  }

  private static double division(double a, double b)
  {
    return a / b;
  }

}