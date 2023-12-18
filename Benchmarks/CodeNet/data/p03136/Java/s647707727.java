import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] l = new Integer[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(l);
        int sum = 0;
        for (int length : l) {
            sum += length;
        }

        boolean result = sum - l[n - 1] > l[n - 1];

        System.out.println(result ? "Yes" : "No");
    }
}