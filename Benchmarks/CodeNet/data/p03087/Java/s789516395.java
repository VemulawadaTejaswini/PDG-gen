import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[] nums = new int[n];
        for (int i = 0; i < n - 1; i++) {
            nums[i + 1] = nums[i];
            if (s.substring(i, i + 2).equals("AC")) {
                nums[i + 1]++;
            }
            
        }
        
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            
            System.out.println(nums[r] - nums[l]);
        }
    }
}
