import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),k=Integer.parseInt(s[2]);
        int c=0,i,j,a[]=new int[n],b[]=new int[m];
        long min=0;
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
        s=bu.readLine().split(" ");
        for(i=0;i<m;i++)
            b[i]=Integer.parseInt(s[i]);
        long sum=0,ca[]=new long[n],cb[]=new long[m];
        for(i=n-1;i>=0;i--)
        {
            sum+=a[i];
            ca[i]=sum;
        }
        sum=0;
        for(i=m-1;i>=0;i--)
        {
            sum+=b[i];
            cb[i]=sum;
        }
        i=0;j=0;
        while(i<n && j<m)
        {
            if(min+a[i]>k && min+b[j]>k) break;
            if(a[i]<b[j]) min+=a[i++];
            else if(a[i]>b[j]) min+=b[j++];
            else
            {
                if(ca[i]>cb[i]) min+=b[j++];
                else min+=a[i++];
            }
            c++;
        }
        while(i<n && min+a[i]<=k) {min+=a[i++]; c++;}
        while(j<m && min+b[j]<=k) {min+=b[j++]; c++;}
        System.out.print(c);
    }
}
