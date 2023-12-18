import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int[][] nums=new int[n][2];
        if(s.charAt(0)=='#'){
            nums[0][0]=1;
        }else{
            nums[0][1]=1;
        }
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='#'){
                nums[i][0]=1;
            }else{
                nums[i][1]=1;
            }
            nums[i][0]+=nums[i-1][0];
            nums[i][1]+=nums[i-1][1];
        }
        int output=nums[n-1][1];
        for(int i=0;i<n;i++){
            if(nums[i][0]+nums[n-1][1]-nums[i][1]<output){
                output=nums[i][0]+nums[n-1][1]-nums[i][1];
            }
        }
        System.out.println(output);
    }
}