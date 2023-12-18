import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        long a=scn.nextLong();
        long b=scn.nextLong();
        long c=scn.nextLong();
        long k= scn.nextLong();
        if(k%2==1)
        {
            System.out.println(b-a);
        }
        else
        {
            System.out.println(a-b);
        }
    }
}
