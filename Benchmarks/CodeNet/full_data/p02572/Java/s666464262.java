import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = (1 + (n -1)) * (n - 1) / 2;
        long[] modNums = new long[k];
        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                modNums[l] = ((long)nums[i] * nums[j]) % mod;
                l++;
            }
        }
        long ans = (modNums[0] + modNums[1]) % mod;
        for (int i = 2; i < k; i++) {
            ans = ((long)ans + modNums[i]) % mod;
        }
        System.out.println(ans);
	}
}