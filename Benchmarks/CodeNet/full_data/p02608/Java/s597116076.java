import java.util.*;

public class Main{
 
  public static void main(String args[])
  {
    
   Scanner sc = new Scanner(System.in);
    
    int n= sc.nextInt();
    
    for(int i=0;i<n;i++)
    {
      
     int count =0;
      
      for(int x =1;x<=100 ; x++)
      {
       for(int y=1;y<=100;y++)
       {
        for(int z= 1;z<=100;z++)
        {
          
          int sum = x*x + y*y + z*z + x*y + x*z + y*z;
          if(sum==i)
            count++;
          
          if(sum>i)
            break;
          
        }
         
       }
        
      }
      
      System.out.println(count);
      
      
    }
    
    
  }
  
  
}