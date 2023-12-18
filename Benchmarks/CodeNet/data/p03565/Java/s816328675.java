import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
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
        String T = scan.next();
        char[] data = S.toCharArray();
        int length = data.length;
        char[] hint = T. toCharArray();
        int hint_length = hint.length;
        if (length < hint_length) {
            System.out.println("UNRESTORABLE");
            return;
        }
        List<Integer> candidate = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (length < i+hint_length) {
                break;
            }
            boolean found = true;
            for (int j = 0; j < hint_length; j++) {
                if (data[i+j] == '?') {
                    continue;
                }
                if (data[i+j] != hint[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                candidate.add(i);
                break;
            }
        }
        if (candidate.isEmpty()) {
            System.out.println("UNRESTORABLE");
            return;
        }
        candidate.sort(Comparator.reverseOrder());
        int f = candidate.get(0);
        for (int i = 0; i < hint_length; i++) {
            data[f + i] = hint[i];
        }
        for (int i = 0; i < length; i++) {
            if (data[i] == '?') {
                data[i] = 'a';
            }
        }
        System.out.println(data);
    }
}
