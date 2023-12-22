import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String ans = "No";

        for (int i = 0; i < x + 1; i++) {
            if (2 * (x - i) + 4 * i == y) {
                ans = "Yes";
            }
        }
        System.out.println(ans);
    }
}