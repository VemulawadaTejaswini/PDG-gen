import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),k=Integer.parseInt(s[2]);
        int c=0,i,j,a[]=new int[n],b[]=new int[m],l=0,r=0;
        long sum=0,suma[]=new long[n],sumb[]=new long[m];
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
            sum+=a[i];
            suma[i]=sum;
            if(suma[i]<=k) l=i+1;
        }

        s=bu.readLine().split(" ");
        sum=0;
        for(i=0;i<m;i++)
        {
            b[i]=Integer.parseInt(s[i]);
            sum+=b[i];
            sumb[i]=sum;
            if(sumb[i]<=k) r=i+1;
        }
        if(suma[n-1]+sumb[m-1]<=k) {System.out.print(n+m); return;}
        if(a[0]>k && b[0]>k) {System.out.print(0); return;}
        if(suma[l-1]+sumb[r-1]<=k) {System.out.print(l+r); return;}
        i=l-1;j=r-1;
        while(i>=0 && j>=0)
        {
            if(suma[i]+sumb[j]<=k) break;
            if(a[i]>b[j]) i--;
            else if(a[i]<b[j]) j--;
            else
            {
                if(suma[i]+sumb[j]-b[j]-a[i]>k) {i--;j--;}
                else 
                {if(i>j) i--;
              	else j--;}
            }
        }
        c=i+j+2;
        System.out.print(c);
    }
}
