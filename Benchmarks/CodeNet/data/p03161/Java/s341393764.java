import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int tmp;
        int[] nums=new int[n];
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            tmp=-1;
            for(int j=0;j<Math.min(k,i);j++){
                if(tmp==-1||tmp>dp[i-j-1]+Math.abs(nums[i]-nums[i-j-1])){
                    tmp=dp[i-j-1]+Math.abs(nums[i]-nums[i-j-1]);
                }
            }
            dp[i]=tmp;
        }
        System.out.println(dp[n-1]);

    }
}