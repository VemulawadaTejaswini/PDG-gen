import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int r = -1;
        for (int i = 1; i*i <= m; i++) {
            if (m % i == 0 && m / i >= n) {
                r = i;
            }
        }
        System.out.println(r);

        sc.close();
    }

}