import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),i;
        StringBuilder sb=new StringBuilder();
        int l=1,r=n%2==0?n:n-1;
        for(i=0;i<m;i++)
        {
            sb.append(l+" "+r+"\n");
            l++; r--;
        }
        System.out.print(sb);
    }
}
