import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = Integer.parseInt(sc.next());
        int count = Integer.parseInt(sc.next());
        Set<Integer> nums = new HashSet<Integer>();
        for (int i = 0; i < count; i++) {
            nums.add(Integer.parseInt(sc.next()));
        }

        if (nums.size() == 0) {
            System.out.println(target);
            return;
        }

        for (int i = 1; i <= 100; i++) {

            if ((target - i) > 0) {
                if (!nums.contains((target - i))) {
                    System.out.println(target - i);
                    return;
                }
            }

            if ((target + i) <= 100) {
                if (!nums.contains((target + i))) {
                    System.out.println(target + i);
                    return;
                }
            }

        }
        System.out.println(0);
        sc.close();
    }
}

