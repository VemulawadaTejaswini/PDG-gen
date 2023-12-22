import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]),c=Integer.parseInt(s[2]),k=Integer.parseInt(s[3]);
        long sum=0;
        sum+=1l*(int)Math.min(a,k);
        k-=a+b;
        if(k>0) sum-=1l*(int)Math.min(k,c);
        System.out.print(sum);
    }
}
