import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long x,a=100,c=0,d;
        x=in.nextLong();
        while(a<x)
        {
            d=(a*1)/100;
            a=a+d;
            c=c+1;
        }
        System.out.println(c);
    }
}

