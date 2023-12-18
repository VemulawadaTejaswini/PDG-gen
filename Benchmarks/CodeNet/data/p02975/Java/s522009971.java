import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        if(n%3!=0){
            System.out.println("No");
            return;
        }
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if((i+1)%(n/3)!=0){
                if(nums[i]!=nums[i+1]){
                    System.out.println("No");
                    return;
                }
            }
        }
        if((nums[0]^nums[n/3]^nums[n/3*2])==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
