import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[200000];
        for(int i=0;i<n;i++){
            nums[sc.nextInt()-1]++;
        }
        Arrays.sort(nums);
        int ans=0;
        for(int i=200000;i>200000-k;i--){
            ans+=nums[i-1];
        }
        System.out.println(n-ans);
    }

    
}