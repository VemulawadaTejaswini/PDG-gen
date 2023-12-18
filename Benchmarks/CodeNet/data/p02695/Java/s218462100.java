import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int max = 0;
        int[] a = new int[q];
        int[] b = new int[q];
        int[] c = new int[q];
        int[] d = new int[q];
        for(int i = 0;i < q; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = 1;
        do{
            int sum = 0;
            for(int j = 0; j < q; j++){
                if(nums[b[j] - 1] - nums[a[j] - 1] == c[j]) sum += d[j];
            }
            max = Math.max(max, sum);
        }while(next(nums, n, m));
        System.out.println(max);
    }
    public static boolean next(int[] nums, int n, int m){
        boolean bl = false;
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] < m){
                nums[i]++;
                for(int j = i + 1; j < n; j++){
                    nums[j] = nums[i];
                }
                bl = true;
                break;
            }
        }
        return bl;
    }
}