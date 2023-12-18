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
        int[] a = new int[data.length+1];
        for (int i = 0; i < data.length; i++) {
            if (i == 0) {
                if (data[i] == '<') {
                    a[0] = 0;
                    a[1] = 1;
                }
                continue;
            }
            if (data[i-1] == '>' && data[i] == '<') {
                a[i] = 0;
                a[i+1] = 1;
                continue;
            }
            if (data[i-1] == '<' && data[i] == '<') {
                a[i+1] = a[i]+1;
            }
        }
        for (int i = data.length-1; 0 <= i; i--) {
            if (i == data.length-1) {
                if (data[i] == '>') {
                    a[i+1] = 0;
                    a[i] = Math.max(a[i],1);
                }
                continue;
            }
            if (data[i] == '>' && data[i+1] == '<') {
                a[i] = Math.max(a[i],1);
                a[i+1] = 0;
                continue;
            }
            if (data[i] == '>' && data[i+1] == '>') {
                a[i] = Math.max(a[i], a[i+1]+1);
            }
        }
        System.out.println(Arrays.stream(a).sum());
    }
}
