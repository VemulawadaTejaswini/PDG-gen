

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
        System.out.println(getSwaps(n, word, red, 'W'));
    }

    private static int getSwaps(int n, String word, int color, char c) {
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) == c) {
                swaps++;
            }
            color--;
            if (color == 0) {
                break;
            }
        }
        return swaps;
    }
}
