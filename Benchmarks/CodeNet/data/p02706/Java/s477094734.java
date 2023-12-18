

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for (int i = 0; i < m; i++) {
            int value = sc.nextInt();
            count += value;
        }
        System.out.println(Math.max(-1, n - count));
    }
}
