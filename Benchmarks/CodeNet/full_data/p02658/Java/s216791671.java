import java.util.Scanner;
 
class Main
{
  public static void main(String args[])
  {
    int val;
    Scanner s = new Scanner(System.in);
    val = s.nextInt();
	long sum = 1;
    
    for( int i = 0;i<val;i++)
    {
      sum *= s.nextLong();
      if( sum < 0 || sum >= 1000000000000000000 )
      {
        sum = -1;
        break;
      }
    }
    System.out.println(sum);
  }
}