import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
   int n = s.nextInt();
    int [] arr = new int [n];
    
    for(int i = 0; i < n;i++)
    {
      arr[i] = s.nextInt();
    }
    
    int count = 0;
    for(int i = 0;i < n; i++)
      {
      boolean found = false;
      for(int j = 0; j < n; j++)
      {
        if(j != i)
          if((arr[j]%arr[i]) == 0)
          {
            found = true;
          }
       
      }
      if(!found) count++;
      }
    System.out.println(count);                      
  }
}