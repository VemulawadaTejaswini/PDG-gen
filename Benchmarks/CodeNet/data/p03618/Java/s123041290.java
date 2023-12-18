import java.util.Scanner;

public class Main {
    char[] cs;
    long[] cnts;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        cs = sc.nextLine().toCharArray();
    }

    private void solve() {
        int n = 'z' - 'a' + 1;
        cnts = new long[n];
        for (char c: cs)
            cnts[c - 'a']++;
        long ans = 0L;
        long same = 0L;
        for (int i = 0; i < n; i++) {
            same += (cnts[i] * (cnts[i] - 1)) / 2;
        }
        ans = ((long)(cs.length * (cs.length - 1))) / 2;
        ans -= same;
        System.out.println(ans+1);
    }
}
