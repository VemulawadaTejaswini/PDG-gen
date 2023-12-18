import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-k+1;i++){
            ans=Math.min(ans,nums[i+k-1]-nums[i]+Math.min(Math.abs(nums[i+k-1]),Math.abs(nums[i])));
        }
        System.out.println(ans);

    }
}