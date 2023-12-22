import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        double[] a = new double[t];
        for(int i=0; i<t; i++)
        {
            a[i] = s.nextDouble();
        }
        int c = 0;
        for(int i=0; i<t-1; i++)
        {
            for(int j=i+1; j<t ;j++)
            {
                if(a[i]*a[j]==(int)(a[i]*a[j]))
                    c++;
            }
        }
        System.out.println(c);
    }
}