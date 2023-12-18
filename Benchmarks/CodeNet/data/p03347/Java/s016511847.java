import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[sc.nextInt()];
        int[] nums2=new int[nums.length];
        int output=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int tmp=0;
        if(nums[0]!=0){
            System.out.println(-1);
            return;
        }
        for(int i=0;i<nums.length-1;i++){
            tmp=nums[i+1]-nums[i];
            if(tmp==1){
                output+=1;
            }else if(tmp<1){
                output+=nums[i];
            }else{
                System.out.println(-1);
                return;
            }
            
        }
        
        System.out.println(output);
        
        
        

}

}