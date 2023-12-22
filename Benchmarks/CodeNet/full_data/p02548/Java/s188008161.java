/*
    Written by Kabir Kanha Arora
    @kabirkanha
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i < n; ++i) {
            sum += (n - 1) / i;
        }
        System.out.println(sum);
    }

}
