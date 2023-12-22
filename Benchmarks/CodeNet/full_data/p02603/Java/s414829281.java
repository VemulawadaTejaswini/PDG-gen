import java.util.*;
import java.math.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // int max = 1000;
        if(n==0 || n==1)
        {
            System.out.println("1000");
        }
        else
        {
            long curr = 1000;
            int i=0;
            int stock =0;
            long max = 1000;
            boolean flag = false;
            for(i=0;i<n-1;i++)
            {
                if(arr[i]<=arr[i+1])
                {
                    if(flag==false)
                    {
                        stock = (int)(curr/arr[i]);
                        curr -=stock*arr[i];
                        flag=true; 
                    }
                    else{
                        continue;
                    }
                }
                else{
                    curr+=stock*arr[i];
                    max = Math.max(curr,max);
                    flag=false;
                }
            }
            long value=0;
            if(flag)
            {
                value = arr[n-1]*stock;
            }
            max = Math.max(max,curr+value);
            System.out.println(max);
        }

    }
}