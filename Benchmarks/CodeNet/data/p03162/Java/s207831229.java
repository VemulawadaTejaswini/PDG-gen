import java.util.*;
class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]= new int[n][3];
        for(int i =0;i<n;i++)
        {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int j=1;j<n;j++)
        {
            arr[j][0] += Math.max(arr[j-1][1],arr[j-1][2]);
            arr[j][1] +=Math.max(arr[j-1][0],arr[j-1][2]);
            arr[j][2] +=Math.max(arr[j-1][1],arr[j-1][0]);
        }
        for(int i =0;i<n;i++)
        {
            System.out.println(Arrays.toString(arr[i]));
        }
        for(int i=0;i<3;i++)
        {
            max = Math.max(max,arr[n-1][i]);
        }
        System.out.println(max);

    }
}