import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        String[] hAry = scanner.nextLine().split(" ");
        int ans = 0;
        int counter = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int h = Integer.valueOf(hAry[i]);
            if (h <= prev) {
                counter++;
                if (counter > ans) ans = counter;
            } else {
                if (counter > ans) ans = counter;
                counter = 0;
            }
            prev = h;
        }
        System.out.println(ans);
    }
}