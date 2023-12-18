import java.util.*;
import java.math.*;
class Main
{
    static int count = 0;
    static int  mod = 1000000007;
    public static void traverse(int arr[], int start, int end, int k)
    {
        if(start==end)
        {
            if(k==0)
            {
                count = (count%mod + 1%mod)%mod;
            }
            return;
        }
        if(k<0)
        {
            return;
        }
        for(int j=0;j<=arr[start];j++)
        {
            traverse(arr,start+1,end,k-j);
        }
        return;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        traverse(arr,0,n,k);
        System.out.println(count);
    }
}