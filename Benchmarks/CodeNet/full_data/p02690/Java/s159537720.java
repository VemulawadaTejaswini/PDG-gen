import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    for(int i=-200;i<200;i++)
    {
      for(int j=-200;j<200;j++)
      {
        if(X==(i*i*i*i*i)-(j*j*j*j*j))
        {
          System.out.println(i+" "+j);
          break;
        }
      }
    }
  }
}