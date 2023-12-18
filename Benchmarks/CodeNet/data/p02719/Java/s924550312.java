import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long min=n;
        if(k==1) {
            System.out.println("0");
            System.exit(0);
        }
        if(n%k==0)
        {
            System.out.println("0");
            System.exit(0);
        }
        while(true)
        {
            min=Math.min(min,Math.abs(n-k));
            if(n-k<0)
                break;
            else
                n-=k;
        }
        System.out.println(min);
    }
}
