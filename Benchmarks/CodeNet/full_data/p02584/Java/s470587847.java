import java.util.Scanner;
import java.awt.image.BandedSampleModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long k=sc.nextLong();
        long d=sc.nextLong();
        long ans=0;
        if(x<0)
        {
            long dis=Math.abs(x)/d;
            if(k<=dis)
            {
                ans=Math.abs(x+k*d);
            }
            else
            {
                long moves=k-dis;
                if(moves%2==0)
                {
                    ans=Math.abs(x+dis*d);
                }
                else
                {
                    ans=Math.abs(x+dis*d)+d;
                }
               // ans=Math.min(Math.abs(x+dis*d),Math.abs(x+dis*d)+d);
            }
        }
        else if(x>0)
        {
            long dis=Math.abs(x)/d;
            if(k<=dis)
            {
                ans=x-k*d;
            }
            else
            {
                long moves=k-dis;
                if(moves%2==0)
                {
                    ans=Math.abs(x-dis*d);
                }
                else
                {
                    ans=Math.abs(x-dis*d-d);
                }
                //ans=Math.min(Math.abs(x-dis*d),Math.abs(x-dis*d-d));
            }
        }
        else
        {
           // long dis=Math.abs(x)/d;
            if(k%2==0)
            {
                ans=0;
            }
            else
            {
                ans=d;
            }
        }
        System.out.println(Math.abs(ans));
    }
}
