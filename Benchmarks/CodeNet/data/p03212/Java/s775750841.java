import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String tmp = String.valueOf(i);
            if (tmp.contains("7") && tmp.contains("5") && tmp.contains("3")
                    && tmp.replaceAll("7", "").replaceAll("5", "").replaceAll("3", "").length() == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
