import java.util.*;


public class Main {
    public static int max(int[] d)
    {  int ma=0;
        for(int i=0;i<d.length;i++)
            ma=Math.max(ma,d[i]);
    return ma;
    }
    public static long  find(int[] d,int n)
    {  if(d[0]!=0)
        return 0;
    int[] count=new int[n];
    for(int i=0;i<n;i++)
    {
        count[d[i]]++;
    }
    if (count[0]!=1)
        return 0;
    int m=max(d);
    long ans=1;
for(int i=1;i<=m;i++)
{ ans=ans*(long)Math.pow(count[i-1],count[i]);
ans%=998244353;

}
return ans;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++)
        {
            d[i]=s.nextInt();
        }
        System.out.println(find(d,n));
    }

}
