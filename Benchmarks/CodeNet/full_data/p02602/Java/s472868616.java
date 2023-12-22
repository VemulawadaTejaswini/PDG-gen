import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
        int i,a[]=new int[n];
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        Queue<Integer> q=new LinkedList<>();
        for(i=0;i<k;i++)
        q.add(a[i]);
        for(i=k;i<n;i++)
        {
            if(a[i]>q.peek()) sb.append("Yes\n");
            else sb.append("No\n");
            q.poll();
            q.add(a[i]);
        }
        System.out.print(sb);
    }
}