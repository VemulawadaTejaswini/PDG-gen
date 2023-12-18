
import javax.swing.*;
import java.io.*;
import java.sql.Struct;
import java.text.DecimalFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] dp = new boolean[k + 1];
        dp[0] = false;
        for ( int i = 1; i < dp.length; i++) {
            boolean res = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    res = true;
                } else if (i > arr[j] && !(dp[i - arr[j]])) {
                    res = true;
                }
            }
            dp[i] = res;
        }

        if (dp[k] == true) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}