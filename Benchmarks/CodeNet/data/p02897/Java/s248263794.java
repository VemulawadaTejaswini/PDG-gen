import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        System.out.println(count /(double) n);
    }
}
