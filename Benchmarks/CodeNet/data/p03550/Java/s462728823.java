import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextInt();
        int w=sc.nextInt();
        if(n==1){
            System.out.println(Math.abs(w-sc.nextInt()));
            return;
        }
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Math.max(Math.abs(w-nums[n-1]),Math.abs(nums[n-1]-nums[n-2])));
    }
}