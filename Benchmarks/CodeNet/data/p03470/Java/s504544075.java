import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Integer[] nums = new Integer[N];

        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums, Collections.reverseOrder());
        
        int current = nums[0];
        int count = 1;

        for (int i = 1; i < N; i++) {
            if (current != nums[i]) {
                count++;
                current = nums[i];
            }
        }

        System.out.println(count);
    }
}