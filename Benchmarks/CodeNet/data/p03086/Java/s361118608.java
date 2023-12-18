import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] charArray = S.toCharArray();

        List<Integer> counts = new ArrayList<Integer>();
        int cnt = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'A' || charArray[i] == 'C' || charArray[i] == 'G' || charArray[i] == 'T') {
                cnt++;
                if (i == charArray.length -1) {
                    counts.add(cnt);
                }
            }
            else {
                if (cnt != 0) {
                    counts.add(cnt);
                    cnt = 0;
                }
            }
        }
        Collections.sort(counts, Collections.reverseOrder());
        if (counts.size() == 0) {
            System.out.print(0);
        }
        else {
            System.out.print(counts.get(0));
        }
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
