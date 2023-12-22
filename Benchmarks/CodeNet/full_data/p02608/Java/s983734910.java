import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine()),i,j,k;
        int c[]=new int[10001];
        for(i=1;i<=100;i++)
        for(j=1;j<=100;j++)
        for(k=1;k<=100;k++)
        {
            int v=i*i+j*j+k*k+i*j+i*k+j*k;
            if(v<=10000) c[v]++;
        }
        for(i=1;i<=n;i++)
        sb.append(c[i]+"\n");
        System.out.print(sb);
    }
}