import java.util.*;
class Main{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int c = 0;
    int x[][] = new int[n][d];
    for(int i = 0;i < n;i++)
    {
      for(int j = 0;j < d;j++)
      {
        x[i][j] = sc.nextInt();
      }
    }
    
    for(int i = 0;i < n-1;i++)
    {
      for(int j = i+1;j < n;j++)
      {
        double sum = dist(x[i], x[j]);
        if(Math.ceil(sum) == sum)
        {
          c++;
        }
      }
    }
    
    System.out.println(c);
    
  }
  
  
  static double dist(int x[], int y[])
  {
    double sum = 0;
    for(int i = 0;i < x.length;i++)
      sum += Math.pow(x[i]-y[i], 2);
    
    return Math.sqrt(sum);
        
  } 
}
  