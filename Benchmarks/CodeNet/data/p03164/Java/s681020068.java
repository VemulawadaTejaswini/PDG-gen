import java.util.*;
class Main
{
    static long max = Integer.MIN_VALUE;
    public static void knap(int arr[][],boolean visited[], int start, int end, int weight,long total)
    {
        if(weight<0)
        {
            return;
        }
        if(start>end)
        {
            return;
        }
        if(total>max)
        {
            max=total;
        }
       for(int i=start;i<end;i++)
        {
            if(visited[i]==false && weight-arr[i][0]>=0)
            {
                visited[i]=true;
                knap(arr,visited,i+1,end, weight-arr[i][0],total+arr[i][1]);
                visited[i]=false;
            }
        }
        return;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int arr[][]= new int[n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        boolean visited[]= new boolean[n];
        Arrays.fill(visited,false);
        knap(arr,visited,0,n,w,0);
        System.out.println(max);
    }
}