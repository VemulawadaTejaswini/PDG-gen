import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] a = new long[N];
        long t = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
            t = t^a[i];
        }
        long[] ans = new long[N];
        for (int i = 0; i < N; i++) {
            ans[i] = t^a[i];
        }
        System.out.println(Arrays.stream(ans).mapToObj(i -> Long.toString(i)).collect(Collectors.joining(" ")));
    }
}
