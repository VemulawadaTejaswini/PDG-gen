import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long h=sc.nextLong();
        long cntr=0,sum=0;
        while(h!=1)
        {
            sum+=(long)Math.pow(2,cntr);
            h/=2;
            cntr++;
        }
        sum+=(long)Math.pow(2,cntr);
        System.out.println(sum);
    }
}