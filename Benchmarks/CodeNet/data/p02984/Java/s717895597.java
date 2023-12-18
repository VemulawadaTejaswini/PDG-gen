
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int[] a = new int[n];
        final int[] result = new int[n];
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] <= min) {
                min = a[i];
                index = i;
            }
        }

        int l = 0;
        int r = min * 2;
        while (true) {
            boolean left = false;
            int i = ((r + l) / 2) * 2;
            int next = a[index % n] - i / 2;
            result[index] = i;
            boolean found = true;
            for (int j = 1; j < n; j++) {
                if (next > a[(j + index) % n]) {
                    found = false;
                    if (j % 2 == 0) {
                        left = true;
                    }
                    break;
                }
                result[(j + index) % n] = next * 2;
                next = a[(j + index) % n] - next;
            }
            if (next == result[index] / 2 && found) {
                break;
            }
            if (left) {
                r = i / 2;
            } else {
                l = i / 2 + 2;
            }
        }

        System.out.println(String.join(" ", Arrays.stream(result).mapToObj(Integer::toString).collect(Collectors.toList())));
    }
}
