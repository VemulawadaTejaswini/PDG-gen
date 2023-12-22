import java.util.*;
public class Main
{
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[]args)
  {
    int n = sc.nextInt();
    int[]height = new int[n];
    int max = height[0];
    int total =0;
    for(int i=1;i<height.length;i++)
    {
      if(height[i]<=max)
        total+=height[i]-max;
      else
      {
        max = height[i];
      }
    }
    System.out.println(total);
  }
}
