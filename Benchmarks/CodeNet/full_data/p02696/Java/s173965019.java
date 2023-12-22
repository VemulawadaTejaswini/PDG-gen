import java.io.*;
import java.math.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        long a=Long.parseLong(s[0]),b=Long.parseLong(s[1]),n=Long.parseLong(s[2]),ans=0;
        long x=Math.min(n,b-1);
        ans=(long)Math.floor((a*x)/b);
        System.out.print(ans);
    }
}
