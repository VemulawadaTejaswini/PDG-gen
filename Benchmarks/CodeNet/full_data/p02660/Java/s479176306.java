

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long first = Long.parseLong(in.nextLine());
        if (first == 1) {
            System.out.println(0);
            return;
        }
        int res = 0;
        final double root = Math.sqrt(first);
        for (int i = 2; i <= root; i++) {
            int curr = 0;
            while (first % i == 0) {
                first /= i;
                curr++;
            }
            int counter = 1;
            while (curr - counter >= 0) {
                res++;
                curr -= counter++;
            }
        }
        System.out.println(res == 0 ? 1 : res);
    }
}
