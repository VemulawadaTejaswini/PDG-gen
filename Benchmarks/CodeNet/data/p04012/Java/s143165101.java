import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int[] nums = new int['Z' - 'A' + 1];
        char[] string = sc.next().toCharArray();
        for (char c : string) {
            nums[c - 'a']++;
        }

        for (int a : nums) {
            if (a % 2 == 1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}