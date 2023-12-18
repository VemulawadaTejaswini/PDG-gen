import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        List<Integer> nums2 = new ArrayList<Integer>();
        if (n % 2 == 0) {
            for (int i = n - 1; i >= 1; i -= 2) {
                nums2.add(nums[i]);
            }
            for (int i = 0; i <= n - 2; i += 2) {
                nums2.add(nums[i]);
            }
        } else {
            for (int i = n - 1; i >= 0; i -= 2) {
                nums2.add(nums[i]);
            }
            for (int i = 1; i <= n - 2; i += 2) {
                nums2.add(nums[i]);
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(nums2.get(i));
            
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}
