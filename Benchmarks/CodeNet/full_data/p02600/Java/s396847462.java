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
            long curr = 1000;
            int i=0;
            // int stock =0;
            long max = 1000;
            // boolean flag = false;
            for(i=0;i<n-1;i++)
            {
                if(arr[i+1]<=arr[i])
                {
                    continue;
                }
                else
                {
                    long stock = curr/arr[i];
                    curr -=stock*arr[i];
                    curr +=arr[i+1]*stock ;
                }
            }
            System.out.println(curr);
    }
}