import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(sc.next());

            if (n == 0)break;

            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                nums.add(Integer.parseInt(sc.next()));
            }

            List<Integer> sums = new ArrayList<>();
            for (int i = 0; i < nums.size(); i++) {
                sums.add(nums.get(i));

                for (int j = i + 1; j < nums.size(); j++) {
                    sums.add(sums.get(sums.size() - 1) + nums.get(j));
                }
            }
            
            System.out.println(Collections.max(sums));
        }
    }
}