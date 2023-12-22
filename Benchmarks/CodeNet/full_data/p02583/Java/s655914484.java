import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long[] L=new long[n];
        for(int i=0;i<n;i++)
            L[i]=in.nextLong();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(L[i]!=L[j] && L[j]!=L[k] && L[k]!=L[i])
                    {
                        if(L[i]+L[j]>L[k] && L[i]+L[k]>L[j] && L[k]+L[j]>L[i])
                            cnt++;
                    }

                }
            }
        }
        System.out.println(cnt);
    }
}
