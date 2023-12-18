

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());

        int sum = a[0];
        int tmp = n/2+1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < tmp; i++) {
            sb.append(sum +" "+a[i]);
            sb.append("\r\n");
            sum +=a[i];
        }
        for (int i = tmp; i < n; i++) {
            sb.append(sum +" "+a[i]);
            sb.append("\r\n");
            sum -= a[i];
        }

        System.out.println(sum);
        System.out.print(sb.toString());
    }
}