import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int ans[] = new int[n];
    
    for(int i = 0; i < n; i++)
    {
      ans[i] = 0;
    }
    
    for(int i = 0; i < n; i++){
      ans[stdIn.nextInt()] ++;
    }
    
    for(int i = 0; i < n; i++){
      System.out.println(ans[i]);
    }
  }
}
