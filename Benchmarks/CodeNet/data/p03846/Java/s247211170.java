import java.util.*;

public class Main {
    static long MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);
        
        boolean clear = true;
        long answer = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (nums[i] - 1 != i) {
                        clear = false;
                        break;
                    }
                } else {
                    if (nums[i] != i) {
                        clear = false;
                        break;
                    }
                }
            }
            
            if (clear) {
                answer = (long)Math.pow(2, n/2) % MOD;
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (nums[i] != i) {
                        clear = false;
                        break;
                    }
                } else {
                    if (nums[i] - 1 != i) {
                        clear = false;
                        break;
                    }
                }
            }
            
            if (clear) {
                answer = (long)Math.pow(2, (n - 1)/2) % MOD;
            }
        }
        
        System.out.println(answer);
    }
}
