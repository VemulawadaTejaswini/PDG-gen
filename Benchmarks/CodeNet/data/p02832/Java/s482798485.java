import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(sc.next());
            nums[i] = element;
        }
        int min = 1;
        for (int i = 0; i < n; i++) {
            int element = nums[i];
            if (element == min) {
                min++;
            }
        }
        int diff = min == 1 ? -1 : n + 1 - min;
        System.out.println(diff);
    }
}
