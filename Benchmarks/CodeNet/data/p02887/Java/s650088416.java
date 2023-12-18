package miscellaneous;

import java.util.Scanner;

/**
 * Created by Krishna Kota on 26/10/19
 */

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) != str.charAt(i-1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
