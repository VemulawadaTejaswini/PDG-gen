import java.util.*;
import java.io.*;
class Main 
{
    static int BC[][],a[],A,i,Q,s,j;
    public static void main(String args[])throws IOException
    {Main ob=new Main();
        Scanner obj=new Scanner(System.in);
        A=obj.nextInt();
        a=new int[A];
        for(i=0;i<A;i++)
            a[i]=obj.nextInt();
        Q=obj.nextInt();
        BC=new int[Q][2];
        for(i=0;i<Q;i++)
        {
            for(j=0;j<2;j++)
                BC[i][j]=obj.nextInt();
        }
        for(i=0;i<Q;i++)
        {
            s=0;
            ob.replace(BC[i][0],BC[i][1]);
            for(j=0;j<A;j++)
                s+=a[j];
            System.out.println(s);
        }
    }
    void replace(int b,int c)
    {
        int x;
        for(x=0;x<A;x++)
            if(a[x]==b)
                a[x]=c;
    }
  }

