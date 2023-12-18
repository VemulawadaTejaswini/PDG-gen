import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    List<Integer> sweet = new ArrayList<Integer>();
    
    for(int i=0;i<N;i++)
    {
      int a=sc.nextInt();
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
    
    System.out.println(num);
  }
}


      