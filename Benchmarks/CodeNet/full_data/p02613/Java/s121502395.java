import java.util.Scanner;

public class Ahmed
{

    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=0 , w =0 , r=0 , t=0;
        int n =read.nextInt();
        read.nextLine();

        for (int i=1 ; i<=n ; i++)
        {
            String s=read.nextLine();
            if (s =="AC ")
            {
                a=a+1;
            }
            else if (s=="WA")
            {
                w=w+1;
            }
            else if (s=="TLE")
            {
                t=t+1;
            }
            else if (s=="RE")
            {
                r=r+1;
            }
        }
        System.out.print("AC x " +a);
        System.out.println("WA x "+ w );
        System.out.println("TLE x "+t);
        System.out.println("RE x "+r);
    }

}