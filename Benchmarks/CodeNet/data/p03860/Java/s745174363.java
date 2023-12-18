import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        try
        {
          Scanner scan = new Scanner(System.in);
          int a=scan.nextInt();
          int b=scan.nextInt();
          int x=scan.nextInt();
          int count=0;
          for(int i=a;i<b+1;i++)
          {
            if(i%x==0)
            {
                count++;
            }
            else
            {
                continue;
            }
          }
          System.out.println(count);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
