import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String[] list = new String[N];
        output(0);
        list[0] = scan.next();
        if (is_finished(list[0])) {
            return;
        }
        output(N-1);
        list[N-1] = scan.next();
        if (is_finished(list[N-1])) {
            return;
        }
        int left = 0;
        int right = N - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            output(mid);
            list[mid] = scan.next();
            if (is_finished(list[mid])) {
                break;
            }
            if (list[mid].equals(list[right]) &&  (right - mid) % 2 == 1) {
                left = mid;
                continue;
            }
            if (!list[mid].equals(list[right]) &&  (right - mid) % 2 == 0) {
                left = mid;
                continue;
            }
            if (list[mid].equals(list[left]) &&  (left - mid) % 2 == 1) {
                right = mid;
                continue;
            }
            if (!list[mid].equals(list[left]) &&  (left - mid) % 2 == 0) {
                right = mid;
                continue;
            }
            break;
        }
    }
    private void output(int x) {
        System.out.println(x);
        System.out.flush();
    }
    private boolean is_finished(String x) {
        return "Vacant".equals(x);
    }
}
