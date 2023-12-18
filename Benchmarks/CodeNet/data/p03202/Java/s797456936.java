import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        String[] aStrings = sc.nextLine().split(" ");
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = Integer.parseInt(aStrings[i]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (as[i] == 1) {
                count++;
            }
        }
        if (as[0] != 1) {
            count++;
        }
        System.out.println(count);
    }
}