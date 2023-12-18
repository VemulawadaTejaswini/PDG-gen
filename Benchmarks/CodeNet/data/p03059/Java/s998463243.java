import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        String valueStr = sc.nextLine();
        int[] values = changeStrToNums(valueStr, number);
        String costStr = sc.nextLine();
        int[] costs = changeStrToNums(costStr, number);

        int max = 0;
        for (int i = 0; i < number; i++) {
            int diff = values[i] - costs[i];
            if (diff > 0) {
                max += diff;
            }
        }
        System.out.print(max);
    }

    private static int[] changeStrToNums (String input, int count) {
        String[] numStrs = input.split(" ");
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(numStrs[i]);
        }
        return nums;
    }
}
