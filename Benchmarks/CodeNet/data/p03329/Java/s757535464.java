import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Integer> nums = new ArrayList<>();
        nums.add(1);

        for (int i = 6; i <= 100000; i *= 6) {
            nums.add(i);
        }

        for (int i = 9; i <= 100000; i *= 9) {
            nums.add(i);
        }
        
        int[] steps = new int[100001];
        Arrays.fill(steps, Integer.MAX_VALUE);
        steps[0] = 0;
        for (int i = 0; i < steps.length - 1; i++) {
            for (int num : nums) {
                if (i + num <= 100000) {
                    steps[i + num] = Math.min(steps[i] + 1, steps[i + num]);
                }
            }
        }

        System.out.println(steps[n]);
    }
}