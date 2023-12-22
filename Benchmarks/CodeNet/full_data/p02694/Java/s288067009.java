import java.util.Scanner;
public class Main
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=0;
        double amount=0;
        int p=100;
        int r=1;
        while(amount<x)
        {
            amount=(int)p*(Math.pow((100+r),count));
            count++;
            
        }
    
        System.out.println(count+1);
    }
}