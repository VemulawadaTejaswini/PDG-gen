
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        List<Long> pa = new ArrayList<Long>();
        for (int i = 0; i < a; ++i) {
            pa.add(scanner.nextLong());
        }
        List<Long> pb = new ArrayList<Long>();
        for (int i = 0; i < b; ++i) {
            pb.add(scanner.nextLong());
        }
        List<Long> pc = new ArrayList<Long>();
        for (int i = 0; i < c; ++i) {
            pc.add(scanner.nextLong());
        }
        Collections.sort(pa, Collections.reverseOrder());
        Collections.sort(pb, Collections.reverseOrder());
        Collections.sort(pc, Collections.reverseOrder());
        long ans = 0;
        for (int i = 0; i < x; ++i) {
            ans += pa.get(i);
        }
        for (int j = 0; j < y; ++j) {
            ans += pb.get(j);
        }
        int i = x - 1;
        int j = y - 1;
        for (int k = 0; k < x + y && k < c; ++k) {
            long minApple =
                    i >= 0 && j >= 0
                            ? Math.min(pa.get(i), pb.get(j))
                            : i >= 0 ? pa.get(i)
                            : pb.get(j);
            if (i >= 0 && j >= 0) {
                if (pa.get(i) > pb.get(j)) {
                    --j;
                } else {
                    --i;
                }
            }
            if (pc.get(k) >= minApple) {
                ans = ans - minApple + pc.get(k);
            }
        }
        System.out.println(ans);

    }
}
