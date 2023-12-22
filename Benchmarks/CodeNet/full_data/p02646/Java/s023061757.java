import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),v=Integer.parseInt(s[1]);
        s=bu.readLine().split(" ");
        int b=Integer.parseInt(s[0]),w=Integer.parseInt(s[1]);
        long t=Long.parseLong(bu.readLine());
        long p1=t*v+a,p2=t*w+b;
        if(p1<p2) sb.append("NO");
        else sb.append("YES");
        System.out.print(sb);
    }
}
