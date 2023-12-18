import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        String s = "";
        if (n % 2 > 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 > 0) {
                    s = s + String.valueOf(a[i]);
                } else {
                    s = String.valueOf(a[i]) + s;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i % 2 > 0) {
                    s = String.valueOf(a[i]) + s;
                } else {
                    s = s + String.valueOf(a[i]);
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i == s.length() - 1) {
                System.out.println("");
            } else {
                System.out.print(" ");
            }
        }
    }
}