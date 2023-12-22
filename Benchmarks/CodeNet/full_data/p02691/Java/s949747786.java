import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine()),i,a[]=new int[n];
        String s[]=bu.readLine().split(" ");
        HashMap<Long,Long> hm=new HashMap<>();
        long c=0;
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            long v=i-a[i];
            if(hm.get(v)!=null) c+=hm.get(v);
            v=0l+i+a[i];
            if(hm.get(v)==null) hm.put(v,1l);
            else hm.put(v,hm.get(v)+1);
        }
        System.out.print(c);
    }
}
