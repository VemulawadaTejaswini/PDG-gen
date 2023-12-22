import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        char s[]=bu.readLine().toCharArray();
        int i,c=0;
        for(i=0;i<3;i++)
        if(s[i]=='R') c++;
        if(c!=2) sb.append(c);
        else
        {
            if(s[0]=='R' && s[2]=='R') c--;
            sb.append(c);
        }
        System.out.print(sb);
    }
}