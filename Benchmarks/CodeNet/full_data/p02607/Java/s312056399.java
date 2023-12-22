import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(bu.readLine());
        String s[]=bu.readLine().split(" ");
        int k,i,c=0;
        for(i=0;i<n;i++)
        {
            k=Integer.parseInt(s[i]);
            if(k%2==1 && i%2==0) c++;
        }
        System.out.print(c);
    }
}