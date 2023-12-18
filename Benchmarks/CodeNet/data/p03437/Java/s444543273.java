import java.util.*;
import java.io.*;
class main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        long x=s.nextInt();
        long y=s.nextInt();
        if(x%y==0||y%x==0)
        {
            System.out.println("-1");
        }
        System.out.println(x*2);
    }
}