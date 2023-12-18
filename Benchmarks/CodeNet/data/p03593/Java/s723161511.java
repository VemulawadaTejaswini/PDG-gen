import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    int h, w;
    boolean hOdd, wOdd;
    char[] cs;
    int[] counts;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] elems = br.readLine().split(" ");
            h = Integer.parseInt(elems[0]);
            w = Integer.parseInt(elems[1]);
            hOdd = h % 2 == 1;
            wOdd = w % 2 == 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < h; i++) {
                String line = br.readLine();
                sb.append(line);
            }
            cs = sb.toString().toCharArray();
            counts = new int['z'-'a'+1];
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void solve() {
        int[] count = new int[3];
        for (char c: cs) {
            counts[c - 'a']++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0)
                continue;
            int tmp = counts[i];
            int _4 = tmp / 4;
            tmp %= 4;
            int _2 = tmp / 2;
            tmp %= 2;
            int _1 = tmp;
            count[0] += _1;
            count[1] += _2;
            count[2] += _4;
        }
        boolean flg = true;
        int _4, _2, _1;
        int w2 = (w+1)/2, h2 = (h+1)/2;
        if (hOdd && wOdd) {
            _4 = (w2-1) * (h2-1);
            _2 = h2 - 1 + w2 - 1;
            _1 = 1;
        }
        else if (hOdd) {
            _4 = (h2 - 1) * w2;
            _2 = w2;
            _1 = 0;
        }
        else if (wOdd) {
            _4 = (w2 - 1) * h2;
            _2 = h2;
            _1 = 0;
        }
        else {
            _4 = w2 * h2;
            _2 = 0;
            _1 = 0;
        }
        count[2] -= _4;
        if (count[2] >= 0) {
            count[1] += count[2] * 2;
            count[1] -= _2;
            count[0] -= _1;
            if (count[1] == 0 && count[0] == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else {
            System.out.println("No");
        }
    }
}
