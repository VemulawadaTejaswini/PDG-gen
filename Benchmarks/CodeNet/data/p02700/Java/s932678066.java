import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]),c=Integer.parseInt(s[2]),d=Integer.parseInt(s[3]);
        boolean ans=true;
        a=a/d+(a%d>0?1:0);
        c=c/b+(c%b>0?1:0);
        if(a<c) ans=false;
        if(ans) System.out.print("yes");
        else System.out.print("no");
    }
}
