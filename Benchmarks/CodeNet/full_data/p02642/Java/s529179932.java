
import java.util.*;
import java.io.*;
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int count=0;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            flag=0;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                if(a[i]%a[j]==0)
                    flag++;
            }
            if(flag==0)
                count++;
        }
        System.out.println(count);
    }
}
