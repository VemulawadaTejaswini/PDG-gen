import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long m = scanner.nextLong();
        scanner.nextLine();
        List<String> frig = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            frig.add(scanner.next());
        }
        List<String> oven = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            oven.add(scanner.next());
        }
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
        boolean change = false;
        long cheap = 0x7fffffffffffffffL;
        String key;
        long cur1,cur2,curVal;
        long mxt;
        if (frig.size() < oven.size() + 15) {
            List<String> temp1 = oven;
            oven = frig;
            frig = temp1;
            mxt = mxt2;
            long temp2 = b;
            b = a;
            a = temp2;
            change = true;
        } else {
            mxt = mxt1;
        }
        for (int i = 1; i <= a; i++) {
            cur1 = Long.parseLong(frig.get(i-1));
            if ((cur1 + mxt) - chw > cheap) continue;
            for (int j = 1; j <= b; j++) {
                cur2 = Long.parseLong(oven.get(j-1));
                curVal = cur1 + cur2;
                if (curVal - chw > cheap) continue;
                if (change) {
                    key = "" + i + j;
                } else {
                    key = "" + i + j;
                }
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