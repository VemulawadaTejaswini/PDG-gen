

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long first = in.nextLong();
        if (first == 1) {
            System.out.println(0);
            return;
        }
        int res = 0;
        int root = (int) Math.sqrt(first);
        for (int i = 2; i <= root; i++) {
            if (first % i == 0) {
                first /= i;
                res++;
            }
        }
        System.out.println(res == 0 ? 1 : res);
    }
}
