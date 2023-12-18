import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long h = Long.parseLong(sc.next());
            list.add(h);
        }
        Collections.sort(list, Comparator.reverseOrder());
        long l = 0;
        long r = list.get(0) / b;
        while (l < r - 1) {
            long temp = (l + r) / 2;
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                long h = list.get(i);
                if (h > b * temp) {
                    if ((h - b * temp) % (a - b) == 0) {
                        cnt += (h - b * temp) / (a - b);
                    } else {
                        cnt += (h - b * temp) / (a - b) + 1;
                    }
                }
            }
            if (temp >= cnt) {
                r = temp;
            } else {
                l = temp;
            }
        }
        System.out.println(r);
    }
}