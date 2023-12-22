import java.io.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine()),t=0,ans=-1; long cur=0;
        while(t!=n)
        {
            cur=(cur*10)+7;
            cur%=n;
            if(cur==0) {ans=t+1; break;}
            t++;
        }
        System.out.print(ans);
    }
}