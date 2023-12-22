import java.util.*;

public class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    LinkedList<Integer> arr = new LinkedList<Integer>();
    int i = 0;
    int lim = 0;
    while(i < n)
    {
      int j = i;
      while(j+1 < n && s.charAt(j+1) == s.charAt(j))
      {
        j++;
      }
      
      if(i==0 && s.charAt(i) == 'R')
      {
      }
      
      else
      {
        arr.add(j-i+1);
      }
      i = j+1;
      
    }
    
    int w = 0;
    int sum = 0;
    if(arr.size()%2 == 0)
      lim = arr.size();
    
    else
      lim = arr.size()-1;
    for(int j = 0 ;j <lim ; j += 2)
    {
      w += arr.get(j);
      sum += Math.min(arr.get(j+1) , w);
      if(arr.get(j+1) <= arr.get(j))
      {
        w -= arr.get(j);
      }
      
     
      }
    System.out.println(sum);
    }
  }
