import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = Integer.parseInt(sc.next());
        int count = Integer.parseInt(sc.next());
        List<Integer> nums = new ArrayList<Integer>();
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                nums.add(Integer.parseInt(sc.next()));
            }
        } else {
            System.out.println(target);
            sc.close();
            return;
        }

        int fixedTarget = target;
        Boolean isContain = false;
        for (int i = 1; i <= 100; i++) {
            // System.out.println(i);

            isContain = false;
            int minusTarget = fixedTarget - i;
            if (minusTarget > 0) {
                for (int num : nums) {
                    if (num == minusTarget) {
                        isContain = true;
                    }
                }
                if (!isContain) {
                    System.out.println(minusTarget);
                    break;
                }
            }

            isContain = false;
            int plusTarget = fixedTarget + i;
            if (plusTarget <= 100) {
                for (int num : nums) {
                    if (num == plusTarget) {
                        isContain = true;
                    }
                }
                if (!isContain) {
                    System.out.println(plusTarget);
                    break;
                }
            }
        }

        sc.close();
    }
}
