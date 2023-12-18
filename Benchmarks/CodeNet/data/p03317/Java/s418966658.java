

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final String[] line = in.nextLine().split(" ");
        final int n = Integer.parseInt(line[0]);
        final int k = Integer.parseInt(line[1]);
        for (int i = 0; i < n; i++) {
            in.nextInt();
        }
        in.nextLine();
        if (k == 2) {
            System.out.println(n - 1);
        } else {
            System.out.println((int) Math.ceil((double) n / (k - 1)));
        }
    }
}
