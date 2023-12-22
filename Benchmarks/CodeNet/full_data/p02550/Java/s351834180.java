import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k=sc.nextInt();
        int m=sc.nextInt();
        int cnt=0;
        TreeMap<Long,Integer> tmap=new TreeMap<>();
        long prod=1L*k;
        long ans=0;
        int ind=-1;
        for(int i=0;i<Math.min(n,m);i++)
        {
            tmap.put(prod%m,i);
            ans=ans+prod%m;
            cnt++;
            prod*=prod;
            prod%=m;
            if(tmap.containsKey(prod))
            {
                ind=tmap.get(prod);
                break;
            }
        }
        if(ind==-1)
        System.out.println(ans);
        else if(cnt<n)
        {
            long div=0;
            long sum=0;
            for(Map.Entry<Long,Integer> me:tmap.entrySet())
            {
                if(me.getValue()>=ind)
                {
                    sum=sum+me.getKey();
                    div++;
                }
            }
            ans=ans+sum*((n-cnt)/div);
            int cnt1=(int)((n-cnt)%div);
            for(Map.Entry<Long,Integer> me:tmap.entrySet())
            {
                if(me.getValue()>=ind&&me.getValue()<ind+cnt1)
                {
                    ans=ans+me.getKey();
                }
            }
        }
        System.out.println(ans);
    }
}