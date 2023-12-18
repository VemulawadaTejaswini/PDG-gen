import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        if (n == 3) {
            System.out.println("2 5 63");
        } else if (n == 4) {
            System.out.println("2 5 20 63");
        } else if (n == 5) {
            System.out.println("2 5 20 63 30");
        } else {
            HashSet<Integer> nums = new HashSet<>();
            nums.add(2);
            nums.add(3);
            int summary = 2 + 3;
            int[] offset = new int[] {0, 2, 3, 4};
            int k = 0;
            for (int i = 0; i < n - 2; i++) {
                k = i / 4 + 1;
                int ai = k * 6 + offset[i % 4];
                nums.add(ai);
                summary += ai;
            }
            int next6k = (k + 1) * 6;
            int fraction = summary % 6;
            int[] candidateToRemove = new int [] {0, 0, 8, 9, 10};
            if (fraction != 0) {
                nums.remove(candidateToRemove[fraction]);
                nums.add(next6k);
            }
            System.out.println(
                    nums.stream().map((Integer i) -> i.toString()).collect(Collectors.joining(" ")));
        }

    }
}
