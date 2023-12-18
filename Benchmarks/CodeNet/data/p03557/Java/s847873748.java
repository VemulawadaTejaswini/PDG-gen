import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Long> a = new ArrayList<>();
        List<Long> b = new ArrayList<>();
        List<Long> c = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Long.parseLong(sc.next()));
        }
        for (int i = 0; i < n; i++) {
            b.add(Long.parseLong(sc.next()));
        }
        for (int i = 0; i < n; i++) {
            c.add(Long.parseLong(sc.next()));
        }
        Collections.sort(a);
        Collections.sort(b);
        Collections.sort(c);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long temp = b.get(i);
            int idx = Collections.binarySearch(a, temp, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
            idx = idx < 0 ? ~idx : idx;
            int idx2 = Collections.binarySearch(c, temp, (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
            idx2 = idx2 < 0 ? ~idx2 : idx2;
            ans += idx * (n - idx2);
        }
        System.out.println(ans);
    }
}