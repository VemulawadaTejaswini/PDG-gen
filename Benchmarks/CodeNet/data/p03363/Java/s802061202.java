import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt()+1;
        int[] nums=new int[n];
        nums[0]=0;
        int output=0;
        for(int i=1;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]==nums[i+j+1]){
                    output++;
                }
            }
        }
        System.out.println(output);
        
    }
        

    

}