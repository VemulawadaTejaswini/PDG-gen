import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]),c=Integer.parseInt(s[2]),d=Integer.parseInt(s[3]);
        boolean ans=true;
        int ta=a/d, ao=c/b;
        if(a%d>0) ta++;
        if(c%b>0) ao++;
        if(ta<=ao) System.out.print("Yes");
        else System.out.print("No");
    }
}
