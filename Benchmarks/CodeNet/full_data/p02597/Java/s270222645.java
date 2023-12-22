import java.util.*;

public class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    
    int size = 0;
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
        size++;
      }
      i = j+1;
      
    }
    
    int arr[] = new int[size];
    i = 0;
    size = 0;
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
        arr[size++] = j-i+1;
      }
      i = j+1;
      
    }
    
    
    int w = 0;
    int sum = 0;
    if(size%2 == 0)
      lim = size;
    
    else
      lim = size-1;
    for(int j = 0 ;j <lim ; j += 2)
    {
      w += arr[j];
      sum += Math.min(arr[(j+1)] , w);
      if(arr[j+1] <= arr[j])
      {
        w -= arr[j];
      }
      
     
      }
    System.out.println(sum);
    }
  }
