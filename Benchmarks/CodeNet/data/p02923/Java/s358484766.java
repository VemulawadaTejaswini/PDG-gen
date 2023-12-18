import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = i; j < n - 1; j++) {
                if (h[j + 1] <= h[j])
                    count++;
                else
                    break;
            }
            if (count > max)
                max = count;
            if (count == n - i)
                break;
        }
        System.out.println(max);
    }
}