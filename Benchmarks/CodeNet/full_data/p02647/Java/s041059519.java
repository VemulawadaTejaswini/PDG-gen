import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws Exception {
        String[] tokens = br.readLine().split(" ");
        int n = Integer.parseInt(tokens[0]);
        int k = Integer.parseInt(tokens[1]);
        tokens = br.readLine().split(" ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(tokens[i]);
        }
        solve(nums,k);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }


    private static void solve(int[] nums,int k){
        int[] updates = new int[nums.length];
        while(k-->0){
            for(int i=0;i<nums.length;i++){
                update(updates,i-nums[i],i+nums[i],1);
            }
            fill(updates,nums);
            Arrays.fill(updates,0);
            if(terminate(nums))
                return;
        }
    }

    private static void update(int[] updates,int left,int right,int val){
        left = Math.max(0,left);
        updates[left]+=val;
        if(right+1<updates.length)
            updates[right+1]-=val;
    }
    private static void fill(int[] updates,int[] nums){
        for(int i=0;i<updates.length;i++){
            updates[i]=updates[i]+(i-1>=0 ? updates[i-1] : 0);
            nums[i] = updates[i];
        }
    }

    private static boolean terminate(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums.length)
                continue;
            return false;
        }
        return true;
    }
}