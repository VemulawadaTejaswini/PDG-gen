import java.util.*;
public class Main
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      if(m == 0)
      System.out.println(0+" "+0);
      else
      {
          int correct=0;
          int penalty=0;
          int a[]=new int[n];
          for(int i=0;i<m;i++)
            {
                int x = sc.nextInt();
                String xx = sc.next();
                if(a[x-1] == 0)
                {
                    if(xx.equals("WA"))
                        penalty++;
                    else
                    {
                        correct++;
                        a[x-1]=1;
                    }
                        
                }
                
            }
            System.out.println(correct+" "+penalty);
           
      }
     
     
        
      
  }
}