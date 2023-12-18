import java.util.Scanner;
import java.lang.Math; 


class main
{
  public static void main(String[] args)
  {
	Scanner input= new Scanner(System.in);
    int n= input.nextInt();
    
    if(n%2==0)
        System.out.print(n/2);
    else
        System.out.print(n/2 + 1);

  }
}