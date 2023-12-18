class Probability
{
import java.io.Scanner;
public static void main(String []args)
{
       int  ,i,N,x=1;
       double a;
       Scanner sc=new Scanner(System.in);
       System.out.print("\nInput A Number = ");
       n=sc.nextInt();
       for(i=1;i<=N;i++)
       {
              if(i%2==1)
                 x++;
       }   
       a=(double)x/N;
      System.out.print("\nProbability of A = "+a);
}
}