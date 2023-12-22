import java.io.*;
import java.math.*;

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
        int t=Integer.parseInt(bu.readLine());
        BigInteger p1=new BigInteger("0");
        BigInteger p2=new BigInteger("0");
        p1=p1.valueOf(a).add(p1.valueOf(t).multiply(p1.valueOf(v)));
        p2=p2.valueOf(b).add(p2.valueOf(t).multiply(p2.valueOf(w)));
        if(p1.compareTo(p2)>=0) sb.append("YES");
        else sb.append("NO");
        System.out.print(sb);
    }
}
