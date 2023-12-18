import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ns = sc.nextLine();
        int n = Integer.parseInt(ns);
        
        String inputs = sc.nextLine();
        String[] input = inputs.split(" ");
        
        double[] nums = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(nums);
        
        double result = makeResult(nums);
        System.out.println(result);
        
    }

    private static double makeResult(double[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        double[] newNums = new double[nums.length - 1];
        newNums[0] = (nums[0] + nums[1]) / 2;
        for (int i = 1; i < newNums.length; i++) {
            newNums[i] = nums[i + 1];
        }
        return makeResult(newNums);
    }
}
