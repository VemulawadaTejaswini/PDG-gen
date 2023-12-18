// Created by akashbhalotia
import java.io.*;
import java.util.*;
class D
{
    private static int N,a[];
    private static int solve(int i,int A, int B, int C, int f1,int f2, int f3)
    {
        if(i==N)
        {
            if(f1==0||f2==0||f3==0)
                return Integer.MAX_VALUE-100;

            int cost=Math.abs(A)+(f1-1)*10;
            cost+=Math.abs(B)+(f2-1)*10;
            cost+=Math.abs(C)+(f3-1)*10;

            return cost;
        }



        int w=solve(i+1,A,B,C,f1,f2,f3);
        int x=solve(i+1,A-a[i],B,C,f1+1,f2,f3);
        int y=solve(i+1,A,B-a[i],C,f1,f2+1,f3);
        int z=solve(i+1,A,B,C-a[i],f1,f2,f3+1);

        w=Math.min(w,x);
        x=Math.min(y,z);
        w=Math.min(w,x);

        return w;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i;

        String s[]=br.readLine().trim().split(" ");
        N=Integer.parseInt(s[0]);
        int A=Integer.parseInt(s[1]);
        int B=Integer.parseInt(s[2]);
        int C=Integer.parseInt(s[3]);

        a=new int[N];

        for(i=0;i<N;i++)
            a[i]=Integer.parseInt(br.readLine().trim());

        System.out.println(solve(0,A,B,C,0,0,0));
    }
}