import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        char[] string = sc.nextLine().toCharArray();
        int[] count = new int[26];
        for (char c : string) {
            if (count[c - 'a'] == 1) {
                System.out.println("no");
                return;
            }
            count[c - 'a']++;
        }

        System.out.println("yes");
    }
}