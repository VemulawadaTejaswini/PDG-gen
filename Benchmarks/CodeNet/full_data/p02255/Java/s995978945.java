import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(br.readLine());
        final String[] strNums = br.readLine().split(" ");
        final int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }



        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i]) {
                    final int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
            final StringBuilder sb = new StringBuilder();
            for (int j = 0; j < nums.length; j++) {
                sb.append(nums[j]);
                if (j < nums.length - 1) {
                    sb.append(' ');
                }
            }
            sb.append("\n");
            System.out.print(sb.toString());
        }
    }
}