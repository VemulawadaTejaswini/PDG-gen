import java.util.*;
class Main
{
  public static void main(String [ ]args)
  {
    Scanner sc = new Scanner(System.in);
    int A= sc.nextInt();
    int B =sc.nextInt();
    int sum=1;
    int count=0;
    
    while(sum<B)
    {
      count++;
      sum+=(A-1);
    }
    System.out.println(count);
  }
  
}