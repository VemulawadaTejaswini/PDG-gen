import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)nums[i]=sc.nextInt();
        int ans=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1])ans++;
        }
        System.out.println(ans);
        System.out.println(n);
    }
    
}
