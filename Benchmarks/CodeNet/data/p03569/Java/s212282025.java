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
        StringBuffer sb = new StringBuffer();
        for (int i = 0 ; i < length; i++) {
            if (data[i] == 'x') {
                continue;
            }
            sb.append(data[i]);
        }
        String shorten = sb.toString();
        if (shorten.length() == 0) {
            System.out.println(0);
            return;
        }
        char[] shorten_data = shorten.toCharArray();
        for (int i = 0; i < shorten_data.length/2; i++) {
            if (shorten_data[i] != shorten_data[shorten_data.length-i-1]) {
                System.out.println(-1);
                return;
            }
        }
        int target_length = shorten_data.length/2;
        if (shorten_data.length % 2 == 1) {
            target_length += 1;
        }
        int left = 0;
        int right = length - 1;
        int ans = 0;
        while (left < right) {
            int left_count = 0;
            int right_count = 0;
            while(data[left] == 'x') {
                left_count += 1;
                left += 1;
            }
            while(data[right] == 'x') {
                right_count += 1;
                right -= 1;
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
