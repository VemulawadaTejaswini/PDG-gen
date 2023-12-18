
import java.util.Scanner;

 class Main {


    private static int floorSearch(int[] dp, int l, int r, int x){
        int mid=1;
       // int floor=0;
        if(x>=dp[r])
            return r;
        while(l<r){
            mid=(r+l)/2;
            if(dp[mid]==x)
                return mid;
            else{
                if (mid >0 && dp[mid-1] <= x && x < dp[mid])
                    return mid-1;
                if(x< dp[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a =new int[n];

        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int[] dp =new int[n];
        dp[0]=a[0];
        int len=1;

        for(int i=1;i<n;i++){
            if(a[i]>dp[0])
                dp[0]=a[i];
            else{
                if(a[i]<=dp[len-1]){
                    dp[len++]=a[i];
                }
                else{
                    dp[floorSearch(dp, 0, len-1, a[i])]=a[i];
                }
            }
//            for(int j=0;j<len;j++)
//                System.out.print(" " + dp[j]);
//            System.out.println("\n");
        }
        System.out.println(len);

    }
}
