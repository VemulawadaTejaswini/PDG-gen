import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        boolean flag;
        for(int i=0;i<nums[0];i++){
            flag=true;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%(nums[0]-i)!=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(nums[0]-i);
                return;
            }
        }

        
    }
}