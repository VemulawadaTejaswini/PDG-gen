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
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (aStrings[i].equals("1")) {
                count++;
            }
        }
        if (!(aStrings[n - 1].equals("1"))) {
            count++;
        }
        System.out.println(count);
    }
}