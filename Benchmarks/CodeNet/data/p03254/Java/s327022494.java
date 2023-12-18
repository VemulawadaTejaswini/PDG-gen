import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long x = sc.nextInt();
    List<Long> sweet = new ArrayList<Long>();
    
    for(int i=0;i<N;i++)
    {
      long a=sc.nextInt();
      sweet.add(a);
    }
    
    Collections.sort(sweet);
    int num=0;
    
    for(int i=0;i<n;i++)
    {
      if(x - sweet.get(num) >= 0)
      {
        x = x - sweet.get(num);
        num++;
      }
      else
      {
        break;  
      }
    }
    
    if(x > 0)
    {
      num -= 1;
    }
    
    System.out.println(num);
  }
}


      