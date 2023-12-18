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
        String S = scan.next();
        char[] data = S.toCharArray();
        int length = data.length;
        int left = 0;
        int right = length - 1;
        int ans = 0;
        while (left < right) {
            int left_count = 0;
            int right_count = 0;
            if (data[left] == data[right]) {
                left += 1;
                right -= 1;
                continue;
            }
            while(data[left] == 'x') {
                left_count += 1;
                left += 1;
            }
            while(data[right] == 'x') {
                right_count += 1;
                right -= 1;
            }
            if (data[left] != 'x' && data[right] != 'x') {
                System.out.println(-1);
            }
            if (right_count == 0 && left_count == 0) {
                left += 1;
                right -= 1;
                continue;
            }
            ans += Math.abs(left_count - right_count);
        }
        System.out.println(ans);
    }
}
