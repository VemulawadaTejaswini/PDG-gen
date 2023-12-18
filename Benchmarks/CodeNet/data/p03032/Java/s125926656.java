import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int v[] = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }
            int former[] = new int[n];
            int latter[] = new int[n];

            former[0] = v[0];
            latter[0] = v[n-1];
            for (int i = 1; i < n; i++) {
                former[i] = former[i-1] + v[i];
            }
            for (int i = 1; i < n; i++) {
          