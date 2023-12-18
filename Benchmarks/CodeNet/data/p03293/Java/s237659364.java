

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final char[] first = in.nextLine().toCharArray();
        final char[] second = in.nextLine().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        System.out.println(Arrays.equals(first, second) ? "Yes" : "No");
    }
}
