import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        String s[]=bu.readLine().split(" ");
        long ans=0;
        int i,a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        Arrays.sort(a); int c=0;
        for(i=n-1;i>=0;i--)
        {
            if(i==n-1) {c++; ans+=a[i];}
            else
            {
                if(c+2<n) {c+=2; ans+=2*a[i];}
                else {c++; ans+=a[i];}
            }
            if(c==n-1) break;
        }
        System.out.print(ans);
    }
}