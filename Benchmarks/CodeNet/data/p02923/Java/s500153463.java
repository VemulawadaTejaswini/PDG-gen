
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans=0;
        int tmp=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                tmp++;
            }else{
                tmp=0;
            }
            ans=Math.max(ans,tmp);
        }
        System.out.println(ans);
        
    }


}
