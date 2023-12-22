import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        String ans = "No";

        for (int a = 0; a < X+1; a++) {
            int b = X - a;
            if (2*a + 4*b == Y) {
                ans = "Yes";
            }
        }

        System.out.println(ans);
    }
}
