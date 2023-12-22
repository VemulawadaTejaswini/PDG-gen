import java.util.*;
import java.io.*;
import java.math.*;
class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int cnt=0;
        for(int i=0;i<N;i++)
        {
            double a = sc.nextInt();
            double b = sc.nextInt();
            a = Math.pow(a,2);
            b = Math.pow(b,2);
            double temp = a+b;
            double ans = Math.sqrt(temp);
            //System.out.println("\n\t i="+i+" ans="+ans);
            if(ans <= D)
            {
                cnt++;
                //System.out.println(cnt);
            }
            
        }
        System.out.println(cnt);
    }
}