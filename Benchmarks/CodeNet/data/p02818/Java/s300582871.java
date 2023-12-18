import java.util.Scanner;

public class Main
{
  public static void main(String args[])
  {
    Scanner std = new Scanner(System.in);
    int t = std.nextInt();
    int a = std.nextInt();
    
    do
    {
      if(t > 0)
      {
        t--;
      }
      else if(a > 0)
      {
        a--;
      }
      else
      {
        
      }
    }while(t > 0)
      
     System.out.println(t + " " + a);