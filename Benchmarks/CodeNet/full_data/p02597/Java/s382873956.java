

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = Integer.parseInt(in.nextLine());
        final String word = in.nextLine();
        int red = 0;
        for (char c : word.toCharArray()) {
            if (c == 'R') {
                red++;
            }
        }
        int res = 0;
        for (int i = 0; i < red; i++) {
            if (word.charAt(i) == 'W') {
                res++;
            }
        }
        System.out.println(res);
    }
}
