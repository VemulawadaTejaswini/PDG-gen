import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        long[] count=new long[n+1];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }
        long sum=0;
        for(int i=0;i<n+1;i++){
            sum+=count[i]*(count[i]-1)/2;
        }
        for(int i=0;i<n;i++){
            System.out.println(sum-count[nums[i]]+1);
        }

    }

}