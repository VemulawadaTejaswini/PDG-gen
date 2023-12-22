import java.io.*;
import java.util.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        char al[]=new char[27];
        int i;
        for(i=1;i<=26;i++)
            al[i]=(char)('a'+i-1);
        al[0]='z';
        long n=Long.parseLong(bu.readLine());
        while(n>0)
        {
            int last=(int)(n%26);
            sb.append(al[last]);
            if(last==0) n--;
            n/=26;
        }
        System.out.print(sb.reverse());
    }
}
