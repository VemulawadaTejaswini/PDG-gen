import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        long max = 0;
        String ans = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] > nums[j] && nums[i] != nums[j]) {
                    long tmp = comb(nums[i], nums[j]);
                    if (max < tmp) {
                        max = tmp;
                        ans = nums[i] + " " + nums[j];
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static long comb(int n, int r) {
        if (r == 0) {
            return 1;
        }

        return (n - r + 1) * comb(n, r - 1) / r;
    }
}