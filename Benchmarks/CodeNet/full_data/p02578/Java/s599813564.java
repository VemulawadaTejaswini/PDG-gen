import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0,max1=0;
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=1;i<=n;i++) a[i]=sc.nextInt();
        max1=a[1];
        for(int i=2;i<=n;i++)
        {
            if(a[i]<max1)
            {
                ans+=(max1-a[i]);
            }
            else
            {
                max1=Math.max(max1,a[i]);
            }
        }
        System.out.println(ans);
    }
}
