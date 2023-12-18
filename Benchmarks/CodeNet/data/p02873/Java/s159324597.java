import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] data = S.toCharArray();
        int[] a1 = new int[data.length+1];
        for (int i = 0; i < data.length; i++) {
            if (i == 0) {
                if (data[i] == '<') {
                    a1[0] = 0;
                    a1[1] = 1;
                }
                continue;
            }
            if (data[i-1] == '>' && data[i] == '<') {
                a1[i] = 0;
                a1[i+1] = 1;
                continue;
            }
            if (data[i-1] == '<' && data[i] == '<') {
                a1[i+1] = a1[i]+1;
            }
        }
        int[] a2 = new int[data.length+1];
        for (int i = data.length-1; 0 <= i; i--) {
            if (i == data.length-1) {
                if (data[i] == '>') {
                    a2[i+1] = 0;
                    a2[i] = 1;
                }
                continue;
            }
            if (data[i] == '>' && data[i+1] == '<') {
                a2[i] = 1;
                a2[i+1] = 0;
                continue;
            }
            if (data[i] == '>' && data[i+1] == '>') {
                a2[i] = a2[i+1]+1;
            }
        }
        long[] a = new long[data.length + 1];
        for (int i = 0; i < data.length + 1; i++) {
            a[i] = Math.max(a1[i], a2[i]);
        }
        System.out.println(Arrays.stream(a).sum());
    }
}
