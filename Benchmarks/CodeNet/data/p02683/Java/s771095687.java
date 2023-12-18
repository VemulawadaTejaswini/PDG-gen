import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),x=Integer.parseInt(s[2]);
        int i,j;
        long c[][]=new long[n][m+2],sum[]=new long[m],tot=0;
        for(i=0;i<n;i++)
        {
            s=bu.readLine().split(" ");
            int v=0;
            for(j=0;j<=m;j++)
            {
                c[i][j]=Integer.parseInt(s[j]);
                if(j!=0) {v+=c[i][j];sum[j-1]+=c[i][j];}
            }
            tot+=c[i][0];
            c[i][m+1]=v;
        }
        int flag=0;
        for(i=0;i<m;i++)
            if(sum[i]<x) {flag=1; break;}
        if(flag==1) {System.out.print("-1"); return;}

        Arrays.sort(c,new Comparator<long[]>(){
            public int compare(long e1[],long e2[])
            {
                if(e1[0]>e2[0]) return 1;
                else return -1;
            }});

        for(i=n-1;i>=0;i--)
        {
            flag=0;
            for(j=0;j<m;j++)
                if(sum[j]-c[i][j+1]<x) {flag=1; break;}
            if(flag==0 && tot-c[i][0]>0)
            {
                tot-=c[i][0];
                for(j=0;j<m;j++)
                    sum[j]-=c[i][j+1];
            }
        }
        System.out.print(tot);
    }
}
