import java.util.*;

class Main
{
  public static void main(String [] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int [] arr = new int [n];
    
    for(int i = 0; i < n;i++)
      	arr[i] = s.nextInt();
    
    Arrays.sort(arr);
    
    int ans = 0;
    
    for(int i = 0; i < k; i++)
      ans += arr[i];
    
    System.out.println(ans);
  }
}