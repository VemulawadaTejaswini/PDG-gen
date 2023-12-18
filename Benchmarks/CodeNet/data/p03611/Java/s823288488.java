import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str_as = br.readLine().split(" ");
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = Integer.parseInt(str_as[i]);
        }
        
        int[] nums = new int[100001];
        
        for (int a : as) {
            nums[a]++;
        }
        
        int count;
        int max_count = 1;
        for (int i = 0; i < 100001; i++) {
            if (i == 0) {
                count = nums[i] + nums[i+1];
            }
            else if (i == 100000) {
                count = nums[i] + nums[i-1];
            }
            else {
                count = nums[i-1] + nums[i] + nums[i+1];
            }
            if (count > max_count) max_count = count;
        }
        System.out.println(max_count);
    }
}
