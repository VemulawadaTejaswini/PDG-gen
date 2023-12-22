import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    while (true)
    {
      String line = reader.readline();
      String[] ops = line.split(" ", 0);

      if (ops == "+")
      {
        System.out.println(ops[0] + ops[2]);
      }
      else if (ops == "-")
      {
        System.out.println(ops[0] - ops[2]);
      }
      else if (ops == "*")
      {
        System.out.println(ops[0] * ops[2]);
      }
      else if (ops == "/")
      {
        System.out.println(ops[0] / ops[2]);
      }
      else
      {
        break;
      }
    }
  }
}
