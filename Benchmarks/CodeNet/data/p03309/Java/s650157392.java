import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int b = -200000;
        int tmp = 0;
        int tmp2 = Integer.MAX_VALUE;
        int output = 0;
        for(int i=0;i<nums.length;i++){
            nums[i]-=i;
        }
        Arrays.sort(nums);
        int c=nums[(int)((nums.length+1)/2)-1];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]-c>=0){
                output+=nums[i]-c;
            }else{
               output-=nums[i]-c; 
            }
        }
        System.out.println(output);

    }

}