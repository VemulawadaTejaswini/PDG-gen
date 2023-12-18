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
        long count = 0;
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (i == 0)
                a[0] = b[0];
            else {
                a[i] = Math.min(b[i], b[i - 1]);
            }
        }
        a[n - 1] = b[n - 2];
        for (int i = 0; i < n; i++) {
            count += a[i];
        }
        System.out.println(count);
    }
}