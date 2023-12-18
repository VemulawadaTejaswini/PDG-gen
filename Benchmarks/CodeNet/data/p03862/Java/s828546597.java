import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        long count = 0;
        
        while (nums[0] > x) {
            nums[0]--;
            count++;
        }
        
        for (int i = 1; i < n; i++) {
            while (nums[i - 1] + nums[i] > x) {
                nums[i]--;
                count++;
            }
        }
        
        System.out.println(count);
    }
}