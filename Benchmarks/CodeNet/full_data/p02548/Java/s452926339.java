import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int mx=(int)1e6+1;
        int arr[]=new int[mx];
        Arrays.fill(arr,0);
        for(int i=1;i*i<mx;i++)
        {
            for(int j=i*i;j<mx;j+=i)
            {
                arr[j]+=2;
                if(j/i==i)
                arr[j]--;
            }
        }
        for(int i=1;i<=n-1;i++)
        ans+=arr[i];
        System.out.println(ans);
    }
}