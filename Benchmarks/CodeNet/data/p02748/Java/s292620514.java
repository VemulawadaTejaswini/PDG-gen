import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long m = scanner.nextLong();
        scanner.nextLine();
        String[] frig = scanner.nextLine().split(" ");
        String[] oven = scanner.nextLine().split(" ");
        HashMap<String,Long> waribiki = new HashMap<>();
        long t1,t2;
        long w;
        long chw = 0x7fffffffffffffffL;
        long mxt1 = 0;
        long mxt2 = 0;
        for (int i = 0; i < m; i++) {
            t1 = scanner.nextLong();
            t2 = scanner.nextLong();
            w = scanner.nextLong();
            if (mxt1 < t1) {
                mxt1 = t1;
            }
            if (mxt2 < t2) {
                mxt2 = t2;
            }
            if (chw > w) {
                chw = w;
            }
            waribiki.put("" + t1 + t2,w);
        }
        long cheap = 0x7fffffffffffffffL;
        String key;
        long cur1,cur2,curVal;
        for (int i = 1; i <= a; i++) {
            cur1 = Long.parseLong(frig[i-1]);
            if ((cur1 + mxt2) - chw > cheap) continue;
            for (int j = 1; j <= b; j++) {
                cur2 = Long.parseLong(oven[j-1]);
                key = "" + i + j;
                curVal = cur1 + cur2;
                if (curVal - chw > cheap) continue;
                if (waribiki.containsKey(key)) {
                    curVal -= waribiki.get(key);
                }
                if (cheap > curVal) {
                    cheap = curVal;
                }
            }
        }
        System.out.println(cheap);
    }
}