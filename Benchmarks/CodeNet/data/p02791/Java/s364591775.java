import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        int total = 1;
        if (n > 1) {
            for (int i = n - 1; i > 0; i--) {
                if (array[i] < array[i - 1]) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}
