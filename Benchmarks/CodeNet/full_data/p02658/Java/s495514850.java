import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextLong();
    long[] b = new long[a];
    long result = 1;
    
    for(int i = 0; i < a; i++)
    {
      b[i] = sc.nextLong();
      result = result * b[i];
      if(Math.pow(10,18) < result)
      {
        result = -1;
        break;
      }
    }
    System.out.println(result);
  }
}
