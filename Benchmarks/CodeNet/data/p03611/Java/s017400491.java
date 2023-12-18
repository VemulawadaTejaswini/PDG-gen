import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[100000];
        for(int i=0;i<n;i++){
            nums[sc.nextInt()-1]++;
        }
        int output=0;
        for(int i=1;i<99998;i++){
            output=Math.max(output,nums[i-1]+nums[i]+nums[i+1]);
        }
        System.out.println(output);
    }
 
    
}