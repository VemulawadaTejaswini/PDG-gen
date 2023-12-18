import java.awt.*;
import java.util.*;
public class longestPath
{
    public static void main(String args[])throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<ArrayList<Integer>[]> yum=new ArrayList<ArrayList<Integer>[]>();int curr=0;boolean bool=false;ArrayList<Integer> pow2=new ArrayList<Integer>();
        {
            ArrayList<Integer>[] h = new ArrayList[n];
            for (int i = 0; i < n; i++)
            {
                h[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < m; i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                h[y - 1].add(x - 1);
                bool = true;
            }
            yum.add(h);
            pow2.add(1);
        }
        while(bool)
        {
            pow2.add(2*pow2.get(curr));
            bool=false;
            ArrayList<Integer>[] h = new ArrayList[n];
            for (int i = 0; i < n; i++)
            {
                h[i] = new ArrayList<Integer>();
            }
            ArrayList<Integer>[] prev=yum.get(curr);
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<prev[i].size();j++)
                {
                    for(int k=0;k<prev[prev[i].get(j)].size();k++)
                    {
                        h[i].add(prev[prev[i].get(j)].get(k));
                        bool=true;
                    }
                }
            }
            yum.add(h);
            curr++;
        }
        curr--;ArrayList<Integer>[] a;ArrayList<Integer>[] b;ArrayList<Integer>[] c;
        int val=pow2.get(curr);
        int delta=curr-1;
        a=yum.get(curr);
        while(delta>=0)
        {
            bool=false;
            b=yum.get(delta);
            c=new ArrayList[n];
            for (int i = 0; i < n; i++)
            {
                c[i] = new ArrayList<Integer>();
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<a[i].size();j++)
                {
                    for(int k=0;k<b[a[i].get(j)].size();k++)
                    {
                        c[i].add(b[a[i].get(j)].get(k));
                        bool=true;
                    }
                }
            }
            if(bool==true)
            {
                a=c;
                val=val+pow2.get(delta);
            }
            delta--;
        }
        System.out.println(val);
    }
}