import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        nums[0]=sc.nextInt();
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+sc.nextInt();
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.min(ans,Math.abs(nums[n-1]-nums[i]*2));
        }
        System.out.println(ans);
    }
}