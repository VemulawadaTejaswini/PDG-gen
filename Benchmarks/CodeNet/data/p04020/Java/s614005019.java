import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int output=0;
        for(int i=0;i<n;i++){
            output+=nums[i]/2;
            if(i!=n-1&&nums[i+1]!=0){
                output+=nums[i]%2;
                nums[i+1]-=nums[i]%2;
            }
        }
        System.out.println(output);
    }
 
    
}