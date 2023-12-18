import java.util.*;
class Main
{
    // static double total =0.0;
    // public static void select(double arr[],boolean visited[] , int start,double tot,int n, int mid)
    // {
    //     if(start>=n)
    //     {
    //         total +=tot;
    //         System.out.println(tot);
    //         return;
    //     }
    //     for(int i=start;i<n;i++)
    //     {
    //        if(mid>0)
    //         select(arr,visited,i+1,tot*arr[i],n,mid-1);
    //         select(arr,visited,i+1,tot*(1-arr[i]),n,mid);
    //     }
    //     return;
    // }
    // double arr[] = new double[n];
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i]=sc.nextDouble();
    //     }
    //     boolean visited[]=new boolean[n];
    //     Arrays.fill(visited,false);
    //     int mid = n/2+1;
    //     for(int j=mid;j<=n;j++)
    //     {
    //         double tot = 1;
    //         int start=0;
    //         select(arr,visited,start,tot,n,j);
    //     }
    //     System.out.println(total);
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        long c = sc.nextLong();
        int arr[]= new int[n];
        long res[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            res[i]=Long.MAX_VALUE;
        }
        res[0]=0;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                res[i]= Math.min(res[i],(long)(Math.pow(arr[i]-arr[j],2)+c)+res[j]);
            }
        }
        System.out.println(res[n-1]);
    }
}