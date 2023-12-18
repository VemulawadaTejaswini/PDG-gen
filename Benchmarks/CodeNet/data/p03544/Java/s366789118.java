import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();

        long l0 = 2l;
        long l1 = 1l;
        if (n == 1) {
            System.out.println(l1);
            return;
        }

        long li = 0;
        for (int i = 0; i < n - 1; i++) {
            li = l0 + l1;
            l0 = l1;
            l1 = li;
        }

        System.out.println(li);
    }
}