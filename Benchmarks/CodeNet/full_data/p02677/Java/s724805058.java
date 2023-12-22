import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]),h=Integer.parseInt(s[2]),m=Integer.parseInt(s[3]);
        double hr=0.5*(h*60+m),min=6*m,angle=Math.abs(hr-min);
        angle=Math.min(360-angle,angle);
        double d=Math.cos(Math.toRadians(angle));
        double ans=Math.sqrt(-2.0*a*b*d+a*a+b*b);
        System.out.print(ans);
    }
}
