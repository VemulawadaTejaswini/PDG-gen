import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();

        }
Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n - 2; i++) {
            if (input[i] != input[i + 2]) {
                count++;
                input[i + 2] = input[i];
            }

            set.add(input[i]);
            if (i == n - 3) {
                set.add(input[i + 1]);
                set.add(input[i + 2]);
            }
        }
        if (set.size() == 1)
            count = n / 2;
        System.out.println(count);
    }
}