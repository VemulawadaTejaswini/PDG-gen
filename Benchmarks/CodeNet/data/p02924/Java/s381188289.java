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
        long[] retu = new long[n];
        for (int i = 0; i < n; i++) {
            retu[i] = i + 1;
        }
        long sum = 0;

        for (long val : retu) {
            sum += val;
        }
        sum -= retu[n - 1];
        System.out.println(sum);
    }
}