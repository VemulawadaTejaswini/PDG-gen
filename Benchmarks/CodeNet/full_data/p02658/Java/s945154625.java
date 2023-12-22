import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args)
    {


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        BigInteger min=BigInteger.valueOf(1);
        final BigInteger max=BigInteger.valueOf(1000000000000000000L);
        for(int i=0;i<n;i++)
        {  a[i]=sc.nextInt();
        if(a[i]==0)
        {
            System.out.println("-1");
            break;

        }
           min=min.multiply(BigInteger.valueOf(a[i]));

        if(min.compareTo(max)>0)
            System.out.println("1");
        }


            System.out.println(min.toString());



    }
}