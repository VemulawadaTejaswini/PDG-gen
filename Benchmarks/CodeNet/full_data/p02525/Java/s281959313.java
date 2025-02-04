import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    while(true)
    {
      int n = sc.nextInt();
      if (n == 0)
      {
        break;
      }
      int[] scores = new int[n];
      for(int i= 0; i< scores.length; i++)
      {
        scores[i] = sc.nextInt();
      }
      double average = 0, variance = 0;
      for(int j = 0; j < scores.length; j++)
      {
        average = average + scores[j];
      }
      average = average / n;
      for(int k = 0; k < scores.length; k++)
      {
        variance = ( variance + ( (scores[k] - average) * (scores[k] - average) ) )/ n;
      }
      System.out.println(Math.sqrt(variance));
    }
  }
}