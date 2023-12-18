import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        sum[0]=nums[0];
        for(int i=1;i<n;i++){
            sum[i]=nums[i]+sum[i-1];
        }
        int output=1;
        for(int i=1;i<n;i++){
            if(sum[n-i-1]*2>=nums[n-i]||nums[n-i-1]==nums[n-i]){
                output++;
            }else{
                break;
            }
        }
        System.out.println(output);
    }
}