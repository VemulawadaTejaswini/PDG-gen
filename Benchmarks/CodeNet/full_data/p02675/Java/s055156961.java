import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        String ans="";
        n=n%10;
        if(n==0 || n==1 || n==6 || n==8) ans="pon";
        else if (n==2 || n==4 || n==5 || n==7 || n==9) ans="hon";
        else ans="bon";
        System.out.print(ans);
    }
}
